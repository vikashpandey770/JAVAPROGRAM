abstract class Apple{
	void eat() {
		System.out.println("eat an apple");
	}
	abstract void noeat();
	
}

class Banana extends Apple{
	void noeat() {
		System.out.println("hello aplle ");
	}
}
public class Abstract {
public static void main(String[] args) {
	
Banana b=new Banana();
b.eat();
b.noeat();
	
}
}
