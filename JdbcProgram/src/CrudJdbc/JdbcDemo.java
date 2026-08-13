package CrudJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class JdbcDemo {
	
	public static Connection createConnection() {
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/topscruone","root","");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void insertStudent() {
		try {
			
			Student s=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your first name: ");
			s.setFname(sc.next());
			
			System.out.println("enter your Lirst name: ");
			s.setLname(sc.next());
			
			System.out.println("enter your email: ");
			s.setEmail(sc.next());
			
			System.out.println("enter your Address: ");
			s.setAddress(sc.next());
			
			System.out.println("enter your Contact number : ");
			s.setContact(sc.nextLong());
		
			Connection conn=createConnection();
			String sql="insert into student(fname,lname,email,address,contact)values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getAddress());
			pst.setLong(5, s.getContact());
			
			int result =pst.executeUpdate();
			if(result>0) {
				System.out.println("student insert successfully");
			}
			
			pst.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public static void updateStudent() {
	Connection conn =createConnection();
	PreparedStatement pst=null;
		try {
			
			Student s=new Student();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Id for Student: ");
			int id=sc.nextInt();
			
			String sql1="select * from student where id=?";
			pst=conn.prepareStatement(sql1);
			pst.setInt(1, id);

			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("current first name: "+rs.getString("fname"));
				System.err.println("current last name: "+rs.getString("lname"));
				System.out.println("current Email : "+rs.getString("email"));
				System.out.println("current Address : "+rs.getString("address"));
				System.out.println("current contact : "+rs.getLong("contact"));

			}

			System.out.println("---- now Enter new Information to update ----");
			
			System.out.println("enter your first name: ");
			s.setFname(sc.next());
			
			System.out.println("enter your Lirst name: ");
			s.setLname(sc.next());
			
			System.out.println("enter your email: ");
			s.setEmail(sc.next());
			
			System.out.println("enter your Address: ");
			s.setAddress(sc.next());
			
			System.out.println("enter your Contact number : ");
			s.setContact(sc.nextLong());
		
			
			String sql="update student set fname=?,lname=?,email=?,address=?,contact=? where id=?";
			pst=conn.prepareStatement(sql);
			
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getAddress());
			pst.setLong(5, s.getContact());
			pst.setInt(6, id);

			pst.executeUpdate();
			System.out.println("data updated successfully");
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void deleteStudent() {
		Connection conn=createConnection();
		PreparedStatement pst=null;
		
		try {
			Student s=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id for Student Delete Data : ");
			int id=sc.nextInt();
			String sql1="delete from student where id=?";
			
			pst=conn.prepareStatement(sql1);
			pst.setInt(1, id);
			pst.executeUpdate();
			
			System.out.println("data deleted successfully");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void searchStudent() {
		try {
			Connection conn=createConnection();
			String sql="select * from student where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Id: ");
			int id=sc.nextInt();
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("Id :"+rs.getInt("id"));
				System.out.println("First name: "+rs.getString("fname"));
				System.out.println("Last name :"+rs.getString("lname"));
				System.out.println("Email :"+rs.getString("email"));
				System.out.println("Contact :"+rs.getLong("contact"));
			}
			else {
				System.out.println("id not found");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
public static void main(String[] args) {
	System.out.println("-----------  this is a jdbc program  ---------");
Scanner sc=new Scanner(System.in);
System.out.println("****************************************************************");
System.out.println("--------------------Student Management System-------------------");

do {
	System.out.println("**************************************************************");
	System.out.println("1. INSERT STUDENT");
	System.out.println("2. SHOW STUDENT");
	System.out.println("3. UPDATE STUDENT");
	System.out.println("4. DELETE STUDENT");
	System.out.println("5. EXIT");
	System.out.println("****************************************************************");
	
	System.out.print("Enter Your Choice : ");
	int choice=sc.nextInt();
	
	if(choice==1) {
		insertStudent();
	}
	else if(choice==2) {
		searchStudent();
	}
	else if(choice==3) {
		updateStudent();
	}
	else if(choice==4) {
		deleteStudent();
	}
	else if(choice==5) {
		System.out.println("thank you for using our service.");
		break;
	}
	else {
		System.out.println("invalid input type ");
	}
	System.out.println("*************************************************************");
	
	
}while(true);


}
}
