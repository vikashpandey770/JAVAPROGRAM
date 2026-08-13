public class StaticMethod {
	
	static int a=20;
	static int b;
	{
		System.out.println("this is a block 1");
	}
	
	static void mix(int x) {
		System.out.println("x :"+x);
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	static {
		b=a*4;
	}
	
	StaticMethod(){
		System.out.println("this is a default constructor");
	}
	
public static void main(String[] args) {
	mix(10);
	
	
	StaticMethod s=new StaticMethod();
	
	System.out.println("block 2");
}
}