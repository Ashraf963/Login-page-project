package com.src;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class regser
 */
@WebServlet("/regser")
public class regser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
try {  
	
	DBC d=new DBC();
	String sq1="insert into authen values(?,?)";
	String sq11="insert into regdetails values(?,?,?,?)";
	PreparedStatement ps=d.getMyPrepStatement(sq1);
	PreparedStatement ps1=d.getMyPrepStatement(sq11);
	
	ps.setString(1,username);
	ps.setString(2,password);
	
	
	ps1.setString(1,id);
	ps1.setString(2,name);
	ps1.setString(3,username);
	ps1.setString(4,password);
	int i=ps.executeUpdate();
	int j=ps1.executeUpdate();
	
	String message;
	if(i>0 && j>0)
	{
		
	message="registered successfully";
	response.sendRedirect("login.jsp?msg="+message);

	}
	else
	{
		
	message="cannot add student";
	response.sendRedirect("reg.jsp?msg="+message);

	}}
catch(Exception e)
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
