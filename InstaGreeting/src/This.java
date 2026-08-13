
class Done{
	
	int a;
	String name;
	
	Done(){
		System.out.println("hello default");
	}
	
	
	public Done(int a, String name) {
		this.a=a;
		this.name=name;
		
		
	}
	
	void disply() {
		System.out.println("age:"+a);
		System.out.println("name:"+name);
	}
	
	void show(Done d) {
		System.out.println(this.a);
		System.out.println(this.name);
	}
	
}

public class This {
	

	public static void main(String[] args) {
		
		Done d=new Done(15,"vikash");
		d.disply();
		d.show(d);
		
		
	
	}
}
