package FirstJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcProgram {

	public static void main(String[] args) {
		
		try {
			
			// load the driver :
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create a connection :
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjdbcprogram","root","");
			
			if(conn.isClosed()) {
				System.out.println("connection closed...");
			}
			else {
				System.out.println("connection successfull");
			}
			
			String sql="insert into first(name,email,contact) values(?,?,?)";
			//get the prepared statement object
			PreparedStatement pst=conn.prepareStatement(sql);
			
			// set the value
			pst.setString(1,"vikash");
			pst.setString(2,"vikash@gmail.com");
			pst.setLong(3,770593553);
			pst.executeUpdate();
			System.out.println("inserted........");
			
			conn.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
