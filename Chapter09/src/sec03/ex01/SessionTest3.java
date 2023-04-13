package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session3")
public class SessionTest3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	
		
		// getSession()�� ȣ���Ͽ� ���� ��û �� ���� ��ü�� ���� �����ϰų�
		// ���� ������ ��ȯ
		HttpSession session = request.getSession();
		
		out.println("���� ���̵�: " + session.getId() + "<br>");
		out.println("���� ���� ���� �ð�: " + new Date (session.getCreationTime()) + "<br>");
		out.println("�ֱ� ���� ���� ����: " + new Date (session.getLastAccessedTime()) + "<br>");
		out.println("���� ��ȿ �ð�: " + session.getMaxInactiveInterval() + "<br>");
		
//		session.setMaxInactiveInterval(5);	// ������ ��ȿ �ð��� 5�ʷ� ����
//		out.println("���� ��ȿ �ð�:" + session.getMaxInactiveInterval() + "<br>");
		
		
		// ���� ������ �������� �Ǻ�
		if (session.isNew()) {
			out.print("�� ������ ����������ϴ�");
		}
		// ������ ���� ��ü�� ������ ����
		session.invalidate();
	}

}
