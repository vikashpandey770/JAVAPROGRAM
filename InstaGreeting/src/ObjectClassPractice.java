


public class ObjectClassPractice {

	int a=10;
	public static void main(String[] args) {
		ObjectClassPractice o=new ObjectClassPractice();
		System.out.println(o.toString());
		String s1= ("helo");
		String s2= ("helo");
		String s3=new String ("helo");
		
		
		if(s1==s2) {
			System.out.println("true");
		
	}
		else if(s1.equals(s3)) {
			System.out.println("true");
		}
		 if(s1==s3) {
			System.out.println("false");
		}
		 else {
			 System.out.println("false");
		 }
	}
}
