

interface if1{
	void boy();
}

interface if2 extends if1{
	void girl();
}


class jointer implements if2{
 public 	void boy() {
		System.out.println("hello boys how are you");
	}
 public 	void girl() {
		System.out.println("hello girls");
	}
}

public class Impleprograms {

	public static void main(String[] args) {
		System.out.println("this is interface program");
		jointer j=new jointer();
		j.boy();
		j.girl();
		
	}
}
