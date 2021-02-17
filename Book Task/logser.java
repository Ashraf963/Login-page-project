package com.src;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logser
 */
@WebServlet("/logser")
public class logser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u=request.getParameter("uname");
		String p=request.getParameter("pwd");
		DBC d=new DBC();
		String sql="select * from authentication where username=? and password=?";
		try {
			PreparedStatement ps =d.getMyPrepStatement(sql);
			ps.setString(1,u);
			ps.setString(2,p);
			ResultSet rs= ps.executeQuery();
			String message;
			if(rs.next()) {
				
				//here creating cookies
				Cookie ck=new Cookie("user",u);
				response.addCookie(ck);
				response.sendRedirect("pro.jsp?u="+u);
			}
			else {
				message="Invalid username and password";
				
				response.sendRedirect("login.jsp?msg="+message);

			}
			
		}catch(Exception e)
		{
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
