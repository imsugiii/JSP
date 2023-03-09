package sec01.ec01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlat extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		System.out.println("init 메소드 호출");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
//		super.destroy();
		System.out.println("destroy 메소드 호출");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
//		super.init();
		System.out.println("doGet 메소드 호출");
	}

}
