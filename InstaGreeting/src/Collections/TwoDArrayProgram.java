package Collections;

public class TwoDArrayProgram {

	public static <B> void printArray(B [][] inputArray) {
		
		for(int i=0;i<inputArray.length;i++) {
			
			for(int j=0;j<i;j++) {
				
				System.out.println(i+ " ");
		}
			System.out.println();

			}
		}
	
	public static void main(String[] args) {
		
		Integer [][] intArray = { {10,50,03,50,4069}
		, {10,45,79,9,79}};
		
		String strArray[] []= {{"viksh","pandey"}
		, {"karan","nimesh"}};
		
		Double doubArray[] []= {{1.5,40.5,45.8,41.2}
	, {10.56,45.5,45.89,12.2}};
		
		Character charArray[] []= {{'s','s','f','s','e'},
		 {'v','s','t','h','s','a','j'}};
	
		printArray(intArray);
		
		printArray(strArray);
		printArray(doubArray);
		
		
	}
}
