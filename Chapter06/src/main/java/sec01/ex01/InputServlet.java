package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/Input")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id"); // �� user_id �� �ڿ� user_id �� �ٸ�
		String user_pw = request.getParameter("user_pw");
	
		System.out.println("���̵� : " + user_id);
		System.out.println("��й�ȣ : " + user_pw);
		
		String[] subject = request.getParameterValues("subject");	//�������ϱ� �迭 [] ��� 
		System.out.print("������ ���� : ");
		
		for(String str : subject) {
			System.out.println(str + "  ");
		}
	}
}
