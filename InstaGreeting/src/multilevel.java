import java.util.Scanner;
class A{
	int a;
	void getA() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();	
	}	
	void putAA() {
		System.out.println("A:"+a);
	}
}
class B extends A{
	int b;
	void getB() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B:");
		b=sc.nextInt();	
	}	
	void putBB() {
		System.out.println("B:"+b);
	}
}
class C extends B{
	int c;
	void getC() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C:");
		c=sc.nextInt();	
	}
	void putCC() {
		System.out.println("C:"+c);
	}
}
public class multilevel {
public static void main(String[] args) {
	C is=new C();
	is.getA();
	is.getB();
	is.getC();
	is.putAA();
	is.putBB();
	is.putCC();
}
}
