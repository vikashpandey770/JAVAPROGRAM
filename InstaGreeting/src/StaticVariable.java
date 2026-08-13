import java.util.Scanner;

public class StaticVariable{
	static int a;
	void SetA() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
	}
	void PutA() {
		System.out.println("A : "+a);
	}
public static void main(String[] args) {
	
	StaticVariable s=new StaticVariable();
	StaticVariable s1=new StaticVariable();
	StaticVariable s2=new StaticVariable();
	
	s.SetA();
	s1.SetA();
	s2.SetA();
	s.PutA();
	s1.PutA();
	s2.PutA();
	
}
}
