package activity7;

import stackADT.*;

public class Activity7 {
	
	public static void main(String[]args) {
		
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		
		System.out.println("Stack: ");
		System.out.println(stack.toString());
		stack.push(1);
		System.out.println(stack.toString());
		stack.push(4);
		System.out.println(stack.toString());
		stack.push(3);
		System.out.println(stack.toString());
	}
	
	
}
