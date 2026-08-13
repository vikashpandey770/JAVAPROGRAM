
public class NumberPattern {

	
	
	public static void main(String[] args) {
	int num=1;
		for(int i=1;i<10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}	
	}
}