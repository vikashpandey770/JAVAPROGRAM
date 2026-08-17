package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletConfig config;
	ServletContext context;
	
	String email,driver;
@Override
public void init(ServletConfig config) throws ServletException {
	this.config=config;
	this.context=config.getServletContext();
System.out.println("servlet initialized");
}	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		PrintWriter out=response.getWriter();
		email=config.getInitParameter("email");
		System.out.println("Email :"+email);
		out.println("Email: "+email);
		driver=context.getInitParameter("driver");
		System.out.println("driver :"+driver);
		out.println("driver : "+driver);		
 }
    @Override
    public void destroy() {
System.out.println("servlet destroyed......");
    }	
}