import java.util.Scanner;

public class ArayLeng {
	public static void main(String[] args) {

		int i,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("array of elements");
		
		int[] a=new int[5];		
		for(i=0;i<a.length;i++) {
			System.out.println("enter " + i +" element:");
			 a[i]=sc.nextInt();

			 sum=sum+a[i];
		}
		System.out.println("sum of: "+sum);
		
		for(i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			for(i=0;i<a.length;i++) {
			System.out.println("assending order value:"+a[i]);
		}
		
		System.out.println("-------------disending order-----------");
		for(i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
		}
				for(i=0;i<a.length;i++) {
			System.out.println("assending order value:"+a[i]);
		}	
	}
}