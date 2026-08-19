package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.tribes.group.Response;

/**
 * Servlet implementation class FirstProgram
 */
@WebServlet(urlPatterns = "/login",name="FirstProgram")
public class FirstProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   	System.out.println("this is my first servlet program");
PrintWriter out=response.getWriter();

out.println("<h1>Vikash</h1>");


   	
   	}

   	
   	
   	

}
