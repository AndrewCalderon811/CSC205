package project6;

import jsjf.*;

public class StackQueueUtil {

	
	
	public static boolean isPalindrome(String s) {
		
		LinkedStack<Character> stack = new LinkedStack<Character>();
		LinkedQueue<Character> queue = new LinkedQueue<Character>();
		boolean ret = false;
		
		for(int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			
			if(Character.isLetter(c)) {
				stack.push(c);
				queue.enqueue(c);
			}
		}
		
		while(!stack.isEmpty()) {
			if(stack.pop().equals(queue.dequeue())) {
				ret = true;
			}
			else {
				ret = false;
				break;
			}
		}

		return ret;
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
		
		LinkedQueue<Integer> queue1 = new LinkedQueue<Integer>();
		LinkedQueue<Integer> queue2 = new LinkedQueue<Integer>();
		
		boolean ret = false;
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] <= max && arr1[i] >= min) {
				queue1.enqueue(arr1[i]);
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] <= max && arr2[i] >= min) {
				queue2.enqueue(arr2[i]);
			}
		}
		
		while(!queue1.isEmpty()) {
			if(queue1.dequeue().equals(queue2.dequeue())) {
				ret = true;
			}
			else {
				ret = false;
				break;
			}
		}
		
		return ret;
	}

}