public class Alphabates {

	public static void main(String[] args) {

		for(int i=65;i<=75;i++) {
			for(int k=65;k<=75-i;k++) {
				System.out.print(" ");				 
	
			}
			
			for(int j=65;j<=75;j++) {
				System.out.print(" "+(char)i);	
			}
			
			System.out.println();
	
		}
	}
}