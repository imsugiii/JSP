package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// �ѱ� ���� �� ���ڵ� �۾� ���� - Filter�� ó��
	//	request.setCharacterEncoding("utf-8");
	//response.setContentType("text/html;charset=utf-8");
    
	PrintWriter out = response.getWriter();	
	
	// getParameter() �޼��带 �̿��Ͽ� ���۵� ȸ�� ������ �����´�.
	String user_name = request.getParameter("user_name");
	String user_pw = request.getParameter("user_pw");
	String user_address = request.getParameter("user_address");
	String user_email = request.getParameter("user_email");
	String user_hp = request.getParameter("user_hp");

	// �������� ��� ���
	String data = "�ȳ��ϼ���!<br> " + user_name + "�� ȯ���մϴ�.<br><br>";
	data +="<html><body>";
	data +="���̵�: " + user_name + "<br>";
	data +="��й�ȣ: " + user_pw + "<br>";
	data +="�ּ� : " + user_address + "<br>";
	data +="email : " + user_email +"<br>";
	data +="�޴���ȭ : " + user_hp;
	data +="</body></html>";
	out.print(data);
	
	}

}
