package CrudSecond;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Jdbcclasses {

	public static  Connection createConnection() {
		
		Connection conn=null;	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	 conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/topscruone","root","");	
	
	System.out.println("success driver manager");
		
		}catch(Exception e){
			e.printStackTrace();	
		}
		
		return conn;		
	}
	
	public static void insert() {
		try {
			
			Form  f=new Form();
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter your first name: ");
			f.setFname(sc.nextLine());
			
			System.out.print("Enter your Last name: ");
			f.setLname(sc.nextLine());
			
			System.out.print("Enter your email name: ");
			f.setEmail(sc.nextLine());
			
			System.out.print("Enter your address : ");
			f.setAddress(sc.nextLine());
			
			System.out.print("Enter your near by branch name: ");
			f.setBranch(sc.nextLine());
			
			System.out.print("Enter your City name: ");
			f.setCity(sc.nextLine());
			
			System.out.print("Enter your Course name: ");
			f.setCourse(sc.nextLine());
			
			System.out.print("Enter your State  name: ");
			f.setState(sc.nextLine());
			
			System.out.print("Enter your Pincode : ");
			f.setPincode(sc.nextInt());
			
			System.out.print("Enter your mobile number : ");
			f.setMobile(sc.nextLong());
			
			System.out.print("Enter your Date: ");
			f.setDate(sc.nextInt());
		
			
			Connection conn=createConnection();
			String sql="insert into form(fname,lname,email,address,city,state,mobile,pincode,date,course,branch)values (?,?,?,?,?,?,?,?,?,?,?)"; 
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1,f.getFname());
		pst.setString(2,f.getLname());
		pst.setString(3,f.getAddress());
		pst.setString(4,f.getCity());
		pst.setString(5, f.getCourse());
		pst.setString(6,f.getBranch());
		pst.setString(7,f.getEmail());
		pst.setString(8,f.getState());
		pst.setLong(9,f.getMobile());
		pst.setInt(10,f.getPincode());
		pst.setInt(11,f.getDate());
		
		
		int result=pst.executeUpdate();
		
		if(result>0) {
			System.out.println("student insert successfully");
		}
		pst.close();
		conn.close();
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {			
		Jdbcclasses jc=new Jdbcclasses();
		jc.insert();
	}
}