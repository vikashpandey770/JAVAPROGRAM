package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.Student;
import com.dao.StudentDao;
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert")) {
			
			Student s=new Student();
			
			s.setName(request.getParameter("name"));
			s.setEmail(request.getParameter("email"));
			s.setContact(Double.parseDouble(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setPassword(request.getParameter("password"));
			s.setQualification(request.getParameter("qualification"));
			
			StudentDao.insert(s);
			response.sendRedirect("showpage.jsp");	
		}
		
		else if(action.equalsIgnoreCase("edit")) {
			int Studentid =Integer.parseInt(request.getParameter("studentid"));
			
			Student s=StudentDao.EditStudent(Studentid);
			request.setAttribute("s", s);
			request.getRequestDispatcher("updates.jsp").forward(request, response);
			
			
			
			
			
			
			
		}
		
	
	}

}
