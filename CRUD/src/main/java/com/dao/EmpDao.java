package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Emp;
import com.util.EmpUtil;

public class EmpDao {

	public static void insertEmp(Emp e) {
		
	try {
		Connection conn=EmpUtil.createConnection();
		System.out.println("Connection : "+conn);
		String sql="insert into emp(ename,email,job,dept,salary)values(?,?,?,?,?)";
		
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, e.getEname());
		pst.setString(2, e.getEmail());
		pst.setString(3, e.getJob());
		pst.setString(4, e.getDept());
		pst.setDouble(5, e.getSalary());
		
		pst.executeUpdate();
		
	} catch (Exception e2) {
	e2.printStackTrace();
	}
	}

	
	
	
	
	
	public static List<Emp> getallEmployee(){
		
		List<Emp> list=new ArrayList<Emp>();
	try {
		
		Connection conn=EmpUtil.createConnection();
		
		String sql="select * from emp";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			Emp e=new Emp();
			e.setEid(rs.getInt("eid"));
			e.setEname(rs.getString("Ename"));
			e.setEmail(rs.getString("email"));
			e.setJob(rs.getString("job"));
			e.setDept(rs.getString("dept"));
			e.setSalary(rs.getDouble("salary"));
			
			list.add(e);
			
			
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		
		
		return list;
		
		
	}
	
	
	
	
}
