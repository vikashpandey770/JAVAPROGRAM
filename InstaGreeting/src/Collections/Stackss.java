package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class Stackss {

	public static void main(String[] args) {
		
	Stack<Integer> stack=new Stack<>();
	
	stack.push(10);
	stack.push(45);
	stack.push(70);
	stack.push(25);
	
	System.out.println(stack);
	stack.pop();
	System.out.println(stack);

	System.out.println(stack.search(45));
	
		
		
	
	}
}
