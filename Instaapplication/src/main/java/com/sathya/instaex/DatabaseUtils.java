package com.sathya.instaex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.locks.Condition;

public class DatabaseUtils {
	public static Connection instaConnection()
	{
		
		Connection connection= null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhuvana","suragani");
			}
		catch (ClassNotFoundException|SQLException e) 
		{
			e.printStackTrace();
		}
		return connection;
	}
	

}
