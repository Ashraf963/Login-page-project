package com.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBC {
	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	public Statement getMyStatement()  throws ClassNotFoundException, SQLException
	{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/weddb";
			String user="root";
			String password="root";
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
		
		
		return st;
	}
	
	
	public PreparedStatement getMyPrepStatement(String sql) throws ClassNotFoundException, SQLException
	{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/weddb";
			String user="root";
			String password="root";
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(sql);
			return ps;

}}