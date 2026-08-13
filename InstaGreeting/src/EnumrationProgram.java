import java.util.EnumSet;

enum Studenta{
	
	John(10),vikash(20),Bella(34),Viraj(23);
	private int age;
	int getAge() {
		return age;
		
	}
	void setAge(int age) {
this.age=age;
	}
	
	private Studenta(int age) {
		this.age=age;
	}
	
}

public class EnumrationProgram {

	public static void main(String[] args) {
		System.out.println("age of vikash is "+Studenta.vikash.getAge()+" years");

	//	System.out.println("age of vikash:"+Studenta.vikash.setAge()+" year");

	}
	
}
