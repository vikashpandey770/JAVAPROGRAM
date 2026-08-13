package Collections;

public class Genericsprogram {
	public static <E> void printArray(E [] inputArray) {
		
		for(E e:inputArray) {
			System.out.print(e+ " ,");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer intArray[]= {10,50,03,50,4069};
		String strArray[]= {"viksh","pandey"};
		Double doubArray[]= {1.5,40.5,45.8,41.2};
		Character charArray[]= {'s','s','f','s','e'};
		
		printArray(intArray);
		printArray(strArray);
		printArray(doubArray);
		printArray(charArray);
		
		
		
	}
}
