import java.io.IOException;
import java.util.Scanner;
public class Throw {
	public static void shw() throws ArithmeticException, ArrayIndexOutOfBoundsException,IOException {
	int x;
	Scanner sc=new Scanner(System.in);
//try {
	System.out.println(" x:");
	x=sc.nextInt();
	if(x>0) {
		System.out.println("x is:"+x*x);
	}
	else {
		throw new ArithmeticException();
	}
	//catch(ArithmeticException e) {
//		System.out.println("write a positive value");
	//	shw();
	//}
	//}
	}
public static void main(String[] args) {
	try {
		shw();
	}
		catch(Exception e) {
			System.out.println("please provide positive value");
		
			
			
			}
		
	finally {
		System.out.println("ok done close the program here");
	}	
}
}