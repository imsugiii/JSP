package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/*")
public class TestServlet4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();		
	
		String context = request.getContextPath();
		String url = request.getRequestURI().toString();
		String mapping = request.getServletPath();
		String uri = request.getRequestURI();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Test Servlet4</title>");
		out.println("</head>");
		out.println("<body bgcolor='pink'>");
		out.println("<b>TestServlet4�Դϴ�.</b><br>");
		out.println("<b>���ؽ�Ʈ �̸� : "+context+"</b><br>");
		out.println("<b>��ü ��� : "+url+"</b><br>");
		out.println("<b>���ؽ�Ʈ �̸� : "+mapping+"</b><br>");
		out.println("<b>URI : " +uri+"<b>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	}

}
