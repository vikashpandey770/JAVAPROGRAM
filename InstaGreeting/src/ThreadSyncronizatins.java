class callback{
	
	public void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}


class Caller implements Runnable{

	String msg;
	callback c;
	Thread t;
	
	public Caller(String msg,callback c){
		 this.msg=msg;
		 this.c=c;
		 
		 t=new Thread(this);
		 t.start();
	 }
	
	
	public void run() {
synchronized (c) {

		c.call(msg);
	}
	}	
}
public class ThreadSyncronizatins {
public static void main(String[] args) {
	
	callback c=new callback();
	Caller c2=new Caller("hello", c);
	Caller c3=new Caller("synchroni", c);
	Caller c4=new Caller("world", c);


}	
}
