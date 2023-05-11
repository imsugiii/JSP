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
		
		// 세션 객체 알아보기
		HttpSession session = request.getSession();
		// 세션 객체에 name 바인딩
		session.setAttribute("name", "정수현");
		
		out.println("<html><body>");
		out.println("<h1>세션에 이름을 바인딩합니다.</h1>");
		out.println("<a href='/Chapter12/session/session1.jsp'>첫 번째 페이지로 이동</a>");
		out.println("</body></html>");
	}


}
