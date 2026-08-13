
class Calcu{
	
	void  add(int a,int b){
		System.out.println("Addition of:"+(a+b));
		
	}
	void add(int a,int b,int c) {
		System.out.println( "Multiplication of:"+a*b*c);
	}	
}

public class Methooverload {
	public static void main(String[] args) {
		
		Calcu c=new Calcu();
		c.add(10,25 );
		c.add(15, 10,2);
	}
}