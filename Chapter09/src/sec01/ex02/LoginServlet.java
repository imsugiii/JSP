package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
    
	PrintWriter out = response.getWriter();	
	
	// getParameter() �޼��带 �̿��Ͽ� ���۵� ȸ�� ������ �����´�.
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
	String user_address = request.getParameter("user_address");
	String user_email = request.getParameter("user_email");
	String user_hp = request.getParameter("user_hp");

	// �������� ��� ���
	String data = "�ȳ��ϼ���!<br> " + user_id + "�� ȯ���մϴ�.<br><br>";
	data +="<html><body>";
	data +="���̵�: " + user_id + "<br>";
	data +="��й�ȣ: " + user_pw + "<br>";
	data +="�ּ� : " + user_address + "<br>";
	data +="email : " + user_email +"<br>";
	data +="�޴���ȭ : " + user_hp;
	out.print(data);
	
	// GET �������� �ѱ� �����ϱ� ���� ���ڵ�
	user_address = URLEncoder.encode(user_address, "utf-8");
	
	// ���̵�, ��й�ȣ, �ּ� ������ ������ �� ��° �������� �̵�
	out.print("<a href='/Chapter09/second?user_id" + user_id
			+ "&user_pw=" + user_pw
			+ "&user_address=" + user_address
			+ "'><br><br>�� ��° �������� ������</a>");
	data +="</body></html>";
	out.print(data);
	
	}

}
