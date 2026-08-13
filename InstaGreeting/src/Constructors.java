class Boxx{
	int height,width;
	
	Boxx(){
	System.out.println("hello default constructors it is a");	
	}
	Boxx(int h,int w){
		height=h;
		width=w;
		System.out.println(h*w);	
	}
	}
public class Constructors {
	public static void main(String[] args) {
		Boxx b=new Boxx();
		Boxx b1=new Boxx(10,15);
	}
}