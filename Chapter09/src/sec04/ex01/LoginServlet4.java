package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login4")
public class LoginServlet4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// �α��� â���� ���۵� ���̵��� ��й�ȣ�� ������ ��
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pw");
		
		// memberVO ��ü �����ϰ� �Ӽ����� ���̵�� ��й�ȣ�� ����
		MemberVO memberVO = new MemberVO();
		memberVO.setId(user_id);
		memberVO.setPwd(user_pwd);
		
		MemberDAO dao = new MemberDAO();
		
		boolean result = dao.isExisted(membrVO);
		
		if(result) {
			HttpSession session = request.getSession();
			
			// isLogon �Ӽ��� true�� ���ǿ� ����
			session.setAttribute("isLogon", true);
			// ���̵�� ��й�ȣ�� ���ǿ� ����
			session.setAttribute("login.id", user_id);
			session.setAttribute("login.pwd", user_pwd);
			
			out.print("<html><body>");
			out.print("�ȳ��ϼ���" + user_id + "��!!!<br>");
			out.print("<a href='show'>ȸ����������</a>");
			out.print("</body></<html>");
		} else {
			out.println("<html><body>ȸ�� ���̵� Ʋ���ϴ�.");
			out.println("<a href='login4.html'> �ٽ� �α����ϱ�</a>");
			out.println("</body></html>");
		}
	}

}
