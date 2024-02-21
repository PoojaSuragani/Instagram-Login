package com.sathya.instaex;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Serchservlet")
public class Serchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email= request.getParameter("Email");
		
		InstaDao dao = new InstaDao();
		Instainfo instainfo =dao.searchbyemail(email);
		
		request.setAttribute("instainfo", instainfo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("searchinsta.jsp");
		dispatcher.forward(request, response);
		
	}

}
