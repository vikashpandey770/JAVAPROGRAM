package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.Emp;
import com.dao.EmpDao;
@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getParameter("action");
	
	System.out.println("action : "+action);
	
	if(action.equalsIgnoreCase("insert")) {
		
		Emp e=new Emp();
		e.setEname(request.getParameter("Ename"));
		e.setEmail(request.getParameter("email"));
		e.setJob(request.getParameter("job"));
		e.setDept(request.getParameter("dept"));
		e.setSalary(Double.parseDouble(request.getParameter("salary")));
		
		
		 System.out.println("Name = " + e.getEname());
	        System.out.println("Email = " + e.getEmail());
	        System.out.println("Job = " + e.getJob());
	        System.out.println("Dept = " + e.getDept());
	        System.out.println("Salary = " + e.getSalary());

	        
	        
		EmpDao.insertEmp(e);
		response.sendRedirect("show.jsp");
		
		
		
	}
	}

}
