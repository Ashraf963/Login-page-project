package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bookser
 */
@WebServlet("/bookser")
public class bookser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ck[]=request.getCookies();
		String user=ck[0].getValue();
		String bookname=request.getParameter("bname");
		String bookauthor=request.getParameter("bauthor");
		String bookdesc=request.getParameter("bdesc");
		String bookprice=request.getParameter("bprice");
		String bookurl=request.getParameter("burl");
		
		DBC db=new DBC();
		PreparedStatement ps;
		try {
			
			
			String sql="insert into booksdbs values(?,?,?,?,?,?)";
			PreparedStatement ps1=db. getMyPrepStatement(sql);
			
			
			ps1.setString(1, user);
			ps1.setString(2,bookname);
			ps1.setString(3,bookauthor);
			ps1.setString(4,bookdesc);
			ps1.setString(5,bookprice);
			ps1.setString(6,bookurl);
			
			
			int i=ps1.executeUpdate();
			
			if(i>0)
			{
				response.sendRedirect("pro.jsp");
			}
			else
			{
				response.sendRedirect("book.jsp");
			}
			
			response.setContentType("text/html");//setting the content type  
			PrintWriter out=response.getWriter();
			
			
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		}		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
