
class Demo extends Thread {
	
//	Thread t;
public Demo() {
	// t = new Thread(this,"child thread");
	// t.start();
	super("Child thread");
	start();
}
	public void run() {
		
		try {
			for(int i=0;i<5;i++) 
			{
				Thread.sleep(1000);
				System.out.println(this+" : "+i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main thread exiting");
	
	}
	
	}

public class Threadss {
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Thread t= Thread.currentThread();
		System.out.println(t);
		t.setName("tops");
		System.out.println(t);
		t.setPriority(3);
		System.out.println(t);
		
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(2000);
				System.out.println(t+" : "+i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main thread exiting");
	
	}

	
}
