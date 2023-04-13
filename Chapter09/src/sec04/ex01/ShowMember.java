package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/show")
public class ShowMember extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String id = "", pwd="";
		Boolean isLogon=false;
		//getSession(false) �޼��带 ȣ���Ͽ� ������ ���� ��
		HttpSession session = request.getSession(false);
		
		// ������ �����Ǿ����� Ȯ��
		if (session != null) {
			// getAttribute�� isLogon�� ���ڷ� �����Ͽ� �α��� ���¸� ���� ��
			isLogon=(Boolean)session.getAttribute("isLogon");
			
			// isLogon�� true�̸� �α��� �����̴�.
			if(isLogon==true) {
				// �α��� ���̵�� ��й�ȣ�� ������ ��
				id = (String)session.getAttribute("login.id");
				pwd = (String)session.getAttribute("login.pwd");
				// �α��� ������ ȭ�鿡 ������
				out.print("<html><body>");
				out.print("���̵�: " + id + "<br>");
				out.print("��й�ȣ: " + pwd + "<br>");
				out.print("</body></html>");
			} else {	// �α��� ���°� �ƴϸ� �α��� â���� �̵�
				response.sendRedirect("login4.html");
			}
		} else {	// ������ �������� �ʾ����� �α��� â���� �̵�
			response.sendRedirect("login4.html");
		}
		
	}

}
