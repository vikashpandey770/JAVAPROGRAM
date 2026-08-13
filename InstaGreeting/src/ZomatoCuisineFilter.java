import java.util.Scanner;

public class ZomatoCuisineFilter {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a cuisine: ");
	String cuisine=sc.nextLine();
	
	switch(cuisine){
	
	case "indian":
		System.out.println("Taj Hotel");
		break;
	
	case "chinese":
		System.out.println("The Lella Palace");
		break;
	case "Italian":
		System.out.println("The Hyatt");
		break;
	case "Maxican":
		System.out.println("Marriott Hotel");
	break;
	
	
	
	default:
		System.out.println("not available...........");
}
}
}
