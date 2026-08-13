
class One{
	
	final int a;
	One(){
		a=35;
		System.out.println(a);
	}
	
	void runss() {
		System.out.println("ji test ");
	}
}
class Two extends One{
	void runss() {
		System.out.println("hello");
	}
}

public class Final {
public static void main(String[] args) {
	
	Two t=new Two();
	t.runss();
	
}
}
