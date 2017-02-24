package com.inmind.postgres.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnUtil {
	 public static Connection getConn() 
	    { 
	        Connection conn = null; 
	        try 
	        { 
	            Class.forName("org.postgresql.Driver"); 
	            String url = "jdbc:postgresql://192.168.2.150:5432/postgres"; 
	            try 
	            { 
	                conn = DriverManager.getConnection(url, "postgres", "postgres"); 
	            } 
	            catch (SQLException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	        } 
	        catch (ClassNotFoundException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	 
	        return conn; 
	    } 
	    /** 
	     * @param args 
	     */ 
	    public static void main(String[] args) 
	    { 
	        Connection conn=ConnUtil.getConn(); 
	        String sql="select * from student"; 
	        Statement stmt=null; 
	        ResultSet rs=null; 
	        try 
	        { 
	            stmt=conn.createStatement(); 
	            rs=stmt.executeQuery(sql); 
	            while(rs.next()){ 
	                System.out.println(rs.getInt(1)); 
	            } 
	        } 
	        catch (SQLException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	    }

}
