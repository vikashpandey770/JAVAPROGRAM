import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	
	public static void main(String[] args) {
		System.out.println("this is a try catch block");
		
		int a,b,c;
		
		System.out.println("this is program start");
		Scanner sc=new Scanner(System.in);
try {
		System.out.println("enter A:");
	a=sc.nextInt();
	
	System.out.println("enter B:");
	b=sc.nextInt();
	
	c=a/b;	

	System.out.println("divide by:"+c);
	
}
catch(Exception e) {
	System.out.println("this is a error arithmetic:"+e);
}

finally {
	System.out.println("this is a close of program use : finally");
}


	System.out.println("this program end");
	}
}
