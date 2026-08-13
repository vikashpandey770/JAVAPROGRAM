import java.util.Scanner;

public class MovieAgeGate {

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a age: ");
		int age=sc.nextInt();
		
		if( age>0 && age<13) {
			System.out.println("Kids Section");
		}
		else if(age>=13 && age<=17) {
			System.out.println("Teen Section");
		}
		else if(age>=18) {
			System.out.println("Audult Section");
		}
		
		else {
			System.out.println("error.... valid age provide");
		}
	}
}