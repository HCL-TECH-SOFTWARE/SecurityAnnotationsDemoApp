package com.ibm.appscan.annotations.simpledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHandler {
	
public static void createDatabase(){
		try{
			Connection conn = null;
			String myDB = "Struts2ExampleDB";
			new org.apache.derby.jdbc.EmbeddedDriver();

			conn = DriverManager.getConnection("jdbc:derby:memory:" +myDB+ ";create=true");
			Statement s = conn.createStatement();
			s.execute("create table users(uid int, username varchar(245),password varchar(244))");
			System.out.println("Created user table");
			s.execute("INSERT INTO users VALUES (1,'admin2','admin2')");
			

		}
		catch(Exception e){
			System.out.println("Exception while opening database: "+e.toString());
		}
	}
	public static boolean doLogin(String username, String password){
		try{
			Connection conn = null;
			String myDB = "Struts2ExampleDB";
			new org.apache.derby.jdbc.EmbeddedDriver();

			conn = DriverManager.getConnection("jdbc:derby:memory:" + myDB+ ";");
			Statement s = conn.createStatement();
			ResultSet theLogin = s.executeQuery("SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'");
			
			return theLogin.next();
		} catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
