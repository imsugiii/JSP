package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member8")
public class MemberServlet extends HttpServlet 
{
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doHandle(request, response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doHandle(request, response);
   }

   protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
     request.setCharacterEncoding("utf-8");
      
     response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      MemberDAO dao = new MemberDAO();
      
      List membersList = dao.listMembers();
      
      request.setAttribute("membersList", membersList);
      RequestDispatcher dispatch = request.getRequestDispatcher("viewMembers");
      dispatch.forward(request, response);
   }


}