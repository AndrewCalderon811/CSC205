package project6;

import jsjf.*;

public class StackQueueUtil {

	
	
	public static boolean isPalindrome(String s) {
		
		LinkedStack<String> stack = new LinkedStack<String>();
		LinkedQueue<String> queue = new LinkedQueue<String>();
		
		
		
		
		return false;
	}

	public static String reverseWords(String s) {
		
		LinkedStack<String> stack = new LinkedStack<String>();
		LinkedQueue<String> queue = new LinkedQueue<String>();
		String ret = "";
		
		for (int i = 0; i < s.length(); i++) {
			String c = s.charAt(i) + "";
			
			if(c.equals(" ")) {
				while(!stack.isEmpty()) {
					queue.enqueue(stack.pop());
				}
				queue.enqueue(" ");
			}
			else {
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
		
		while (!queue.isEmpty()) {
			ret += queue.dequeue();
		}
		
		return ret;
	}

	public static boolean checkArrays(int min, int max, int arr1[], int arr2[]) {
		return false;
	}

}