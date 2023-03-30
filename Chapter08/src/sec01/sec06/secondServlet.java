package sec01.sec06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondServlet
 */
@WebServlet("/second6")
public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
   	throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("name");
		out.println("<html><body>");
		out.println("�̸�:"+name);
		out.println("<br>");
		out.println("dispatch�� �̿��� forward �ǽ��Դϴ�.");
		out.println("</body></html>");
		}	
   	}
