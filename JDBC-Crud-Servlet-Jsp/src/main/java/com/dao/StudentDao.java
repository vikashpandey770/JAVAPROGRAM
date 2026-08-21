package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {

	// insert data .............
	
	public static void insert(Student s) {
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="insert into students(name,email,contact,address,password,qualification)values(?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getEmail());
			pst.setDouble(3,s.getContact());
			pst.setString(4,s.getAddress());
			pst.setString(5, s.getPassword());
			pst.setString(6,s.getQualification());
			
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
	
	public boolean delete(int studentid) {
		
		boolean status=false;
		
		try {
Connection conn=StudentUtil.createConnection();

String sql="delete from students where studentid=?";

PreparedStatement pst=conn.prepareStatement(sql);
pst.setInt(1, studentid);

int rows=pst.executeUpdate();

if(rows>0) {
	status = true;
	 
}

			
		} catch (Exception e) {
e.printStackTrace();
		}
		
		
		
		
		return false;
	}
	
	
	
	
	
	
	
	// show in broswer code here.......
	public static List<Student> getStudent(){

		List<Student> list=new ArrayList<Student>();
		
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="select * from students";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Student s=new Student();
				s.setStudentid(rs.getInt("studentid"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setContact(rs.getDouble("contact"));
				s.setPassword(rs.getString("password"));
				s.setAddress(rs.getString("address"));
				s.setQualification(rs.getString("qualification"));

				list.add(s);
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;	
	}
	
	
	
	public static Student EditStudent(int Studentid){

		Student  s=null;
		
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="select * from students where studentid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, Studentid);
			
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				 s=new Student();
				s.setStudentid(rs.getInt("studentid"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setContact(rs.getDouble("contact"));
				s.setPassword(rs.getString("password"));
				s.setAddress(rs.getString("address"));
				s.setQualification(rs.getString("qualification"));

			
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return s;	
	}
	
	
	
	
}
