package com.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class TransactionManagement {
static Connection con=null;
public PreparedStatement getPreparedStatement1() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/weddb";
			String username="root";
			String password = "root";
			con = DriverManager.getConnection(url,username,password);
			String sql="insert into registerdb values(?,?)";
			PreparedStatement ps= con.prepareStatement(sql);
			return ps;
		}
		
public Statement getStatement1() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/weddb";
			String username="root";
			String password = "root";
			con = DriverManager.getConnection(url,username,password);
			Statement ps= con.createStatement();
			return ps;
		}
}


