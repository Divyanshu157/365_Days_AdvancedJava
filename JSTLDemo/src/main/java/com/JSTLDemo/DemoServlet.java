package com.JSTLDemo;

import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

//import org.apache.tomcat.jakartaee.commons.io.IOExceptionList;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request , HttpServletResponse response ) throws ServerException ,IOException, ServletException
	{
		//JSTL --> JSP standard tag library
		
		String nameString = "divyanshu";
		
		
		request.setAttribute("label", nameString);
		
		RequestDispatcher rDispatcher  = request.getRequestDispatcher("display.jsp");
		rDispatcher.forward(request, response);
		
		
		
		
	}
	

}
