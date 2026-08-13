
public class Overloading {
	void A() {
		System.out.println("this is A");
	}
	
	void B(int a) {
		System.out.println("This is a B");
	}
	void C (int a,int b,int c) {
		System.out.println("This is a C");
	}
public static void main(String[] args) {
	
	Overloading o=new Overloading();
	o.A();
	o.B(15);
	o.C(10,20,30);
}
}
