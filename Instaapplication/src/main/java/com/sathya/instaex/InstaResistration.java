package com.sathya.instaex;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InstaResistration")
public class InstaResistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//GET THE REQUESTED DATA
		
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		String Email = request.getParameter("Email");
		String Mobile = request.getParameter("Mobile");
		

		//GIVE THE DATA TO DAO LAYER
		
		InstaDao dao =new InstaDao();
		int result = dao.saveUser(Username, Password, Email, Mobile);
		
		request.setAttribute("result", result);
		
		//send the result to jsp file
				RequestDispatcher dispatcher= request.getRequestDispatcher("registerstatus.jsp");
				dispatcher.forward(request, response);
		
		
	}

}
