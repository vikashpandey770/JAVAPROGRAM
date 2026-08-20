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
	
	
	
	// get employee data........
public static Emp getEmployee(int eid){	
Emp e=null;
	try {
		
		Connection conn=EmpUtil.createConnection();
		
		String sql="select * from emp where eid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, eid);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			 e=new Emp();
			e.setEid(rs.getInt("eid"));
			e.setEname(rs.getString("Ename"));
			e.setEmail(rs.getString("email"));
			e.setJob(rs.getString("job"));
			e.setDept(rs.getString("dept"));
			e.setSalary(rs.getDouble("salary"));	
		}
		
	} catch (Exception e1) {
		// TODO: handle exception
		e1.printStackTrace();
	}
	
		return e;	
	}

// update .........

public static void update(Emp e) {
	
	try {
		Connection conn=EmpUtil.createConnection();
		String sql="update emp set ename=?,job=?,dept=?,salary=? where eid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, e.getEname());
		pst.setString(2, e.getJob());
		pst.setString(3,e.getDept());
		pst.setDouble(4, e.getSalary());
		pst.setInt(5,e.getEid());
		pst.executeUpdate();
		
	} catch (Exception e2) {
		// TODO: handle exception
		e2.printStackTrace();
		}	
}
	
// delete the data for form ......

public static void delete(int eid) {
	
	try {
		Connection conn=EmpUtil.createConnection();
		String sql="delete from emp where eid=?";
		
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setInt(1, eid);
		pst.executeUpdate();
		
		
	} catch (Exception e) {
	e.printStackTrace();
		// TODO: handle exception
	}
	
}








	
}
