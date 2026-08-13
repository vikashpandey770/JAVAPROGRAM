class Bank {
	void interest() {
		System.out.println("bank interest");
	}
}
class Sbi extends Bank{
	void interest() {
		System.out.println("7 % interest of sbi bank");
	}	
}
class Hdfc extends Bank{
	void interest() {
		System.out.println("8 % of hdfc bank intrest");
	}
}
class Icici extends Bank{
	void interest() {
		System.out.println("icici bank 9 % interest");
	}
}
public class MethodOverride {
	public static void main(String[] args) {
		
		Icici i=new Icici();
		i.interest();
		
		Hdfc h=new Hdfc();
		h.interest();
		
		Sbi s=new Sbi();
		s.interest();
		
		Bank b=new Bank();
		b.interest();
			
	}
}