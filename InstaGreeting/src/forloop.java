import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int i=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		for( i=0;i<=n;i++) {
			System.out.println("I:"+i);
			sum+=i;
		}
		System.out.println("sum of:["+sum);
	}
}