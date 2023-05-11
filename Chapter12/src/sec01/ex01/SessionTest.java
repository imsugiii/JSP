package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class SessionTest extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		// ���� ��ü �˾ƺ���
		HttpSession session = request.getSession();
		// ���� ��ü�� name ���ε�
		session.setAttribute("name", "������");
		
		out.println("<html><body>");
		out.println("<h1>���ǿ� �̸��� ���ε��մϴ�.</h1>");
		out.println("<a href='/Chapter12/session/session1.jsp'>ù ��° �������� �̵�</a>");
		out.println("</body></html>");
	}


}
