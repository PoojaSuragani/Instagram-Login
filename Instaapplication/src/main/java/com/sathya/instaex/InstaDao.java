package com.sathya.instaex;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InstaDao {
	public int saveUser(String Username, String Password, String Email, String Mobile)
		
	{
		int result=0;
		Connection connection= DatabaseUtils.instaConnection();
		try {
			//store the data into database
			PreparedStatement preparedStatement= connection.prepareStatement("insert into userinfo values(?,?,?,?)");
			
			preparedStatement.setString(1, Username);
			preparedStatement.setString(2, Password);
			preparedStatement.setString(3, Email);
			preparedStatement.setString(4, Mobile);
			result = preparedStatement.executeUpdate();
			}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	public int deleteByMobile(String mobile)
	{
		
		Connection connection= DatabaseUtils.instaConnection();
		int result=0;
		try {
			//store the data into database
			PreparedStatement preparedStatement= connection.prepareStatement("delete  from userinfo where  Mobile=? ");
			preparedStatement.setString(1, mobile);
			result = preparedStatement.executeUpdate();
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	public Instainfo searchbyemail(String Email) {
		Instainfo instainfo =null;
		Connection connection= DatabaseUtils.instaConnection();
		
		
		try {
			PreparedStatement preparedStatement=  connection.prepareStatement("select * from userinfo where Email=?");
			preparedStatement.setString(1, Email);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
			
			instainfo = new Instainfo();
			instainfo.setUsername(resultSet.getString(1));
			instainfo.setPassword(resultSet.getString(2));
			instainfo.setEmail(resultSet.getString(3));
			instainfo.setMobile(resultSet.getString(4));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return instainfo;
	}
	
	
	
	public List<Instainfo> getAllUsers()
	{
		List<Instainfo> listofusers= new ArrayList<Instainfo>();
		Connection connection= DatabaseUtils.instaConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet =statement.executeQuery("select * from userinfo");
			while(resultSet.next())
			{
				Instainfo instainfo = new Instainfo();
				instainfo.setUsername(resultSet.getString(1));
				instainfo.setPassword(resultSet.getString(2));
				instainfo.setEmail(resultSet.getString(3));
				instainfo.setMobile(resultSet.getString(4));
				listofusers.add(instainfo);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listofusers;
	}
}
