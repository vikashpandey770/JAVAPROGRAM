import java.util.Scanner;

public class ArayLen {

	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter" +i+ " Element : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of:"+sum);

		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			for(int i=0;i<a.length;i++) {
					System.out.println("Enter" +i+ " Element : "+a[i]);
					
				}
				
			
				
		}	
	}

