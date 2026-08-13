import java.util.Scanner;

public class Whilelop {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a N: ");
		n=sc.nextInt();
		
		while(n>0) {
			
			sum=sum+n;
			n--;
		}
		System.out.println("sum:"+sum);
		
	}
}