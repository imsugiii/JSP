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
		
		// getSession()을 호출하여 최초 요청 시 세션 객체를 새로 생성하거나
		// 기존 세션을 변환
		HttpSession session = request.getSession();
		
		out.println("세션 아이디: " + session.getId() + "<br>");
		out.println("최초 세션 생성 시각: " + new Date (session.getCreationTime()) + "<br>");
		out.println("최근 세션 접근 시작: " + new Date (session.getLastAccessedTime()) + "<br>");
		out.println("세션 유효 시간: " + session.getMaxInactiveInterval() + "<br>");
		
//		session.setMaxInactiveInterval(5);	// 세션의 유효 시간을 5초로 설정
//		out.println("세션 유효 시간:" + session.getMaxInactiveInterval() + "<br>");
		
		
		// 최초 생성한 세션인지 판별
		if (session.isNew()) {
			out.print("새 새션이 만들어졌습니다");
		}
		// 생성한 세션 객체를 강제로 삭제
		session.invalidate();
	}

}
