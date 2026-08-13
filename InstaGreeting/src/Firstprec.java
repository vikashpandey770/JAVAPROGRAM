import java.util.Scanner;

public class Firstprec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A: ");
		int A=sc.nextInt();
		
		
		System.out.println("Enter B: ");
		int B=sc.nextInt();
		int c=A+B;
	
		
		System.out.println("Addition:"+c);
		 c=A-B;
	System.out.println("Sub:"+c);	
	c=A*B;
	System.out.println("Mul:"+c);
	
	c=A/B;
	System.out.println("Divi:"+c);
	
	}
}
