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
	
	if(action.equalsIgnoreCase("insert")) {
		
		Emp e=new Emp();
		e.setEname(request.getParameter("Ename"));
		e.setEmail(request.getParameter("email"));
		e.setJob(request.getParameter("job"));
		e.setDept(request.getParameter("dept"));
		e.setSalary(Double.parseDouble(request.getParameter("salary")));
		
		EmpDao.insertEmp(e);
		response.sendRedirect("show.jsp");
		

	}
	else if(action.equalsIgnoreCase("edit")) {
		
		int eid=Integer.parseInt(request.getParameter("eid"));
		Emp e=EmpDao.getEmployee(eid);
		request.setAttribute("e", e);
		request.getRequestDispatcher("update.jsp").forward(request, response);;	
	}
	
	else if(action.equalsIgnoreCase("update")) {
		
		Emp e=new Emp();
		e.setEid(Integer.parseInt(request.getParameter("eid")));
		e.setEname(request.getParameter("Ename"));
		e.setEmail(request.getParameter("email"));
		e.setJob(request.getParameter("job"));
		e.setDept(request.getParameter("dept"));
		e.setSalary(Double.parseDouble(request.getParameter("salary")));
		
		EmpDao.update(e);
		response.sendRedirect("show.jsp");
	}
	
	else if(action.equalsIgnoreCase("delete")) {
		int eid=Integer.parseInt(request.getParameter("eid"));

		EmpDao.delete(eid);
		response.sendRedirect("show.jsp");
		
	}
	
	
	
	}

}
