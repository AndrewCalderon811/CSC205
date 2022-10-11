package project6;

//import project6.StackQueueUtil;
import jsjf.LinkedQueue;
import jsjf.LinkedStack;

public class Project6SampleDriver {

	public static void main(String args[]) {
		LinkedQueue<String> q = new LinkedQueue<String>();
		LinkedStack<String> s = new LinkedStack<String>();

		String[] testStrings1 = {"a", "aa", "aba", "abca", "aabcbaa", "aabbccbbaa", 
                	             "1!a8 (a a&21a.", "abcCBA",
	                             "A man, a plan, a canal: Panama.",
                	             "Are we not drawn onward, we few, drawn onward to new era?", 
	                             "ab", "notapalindrome"};
		String[] testStrings2 = {"To be or not to be, that is the question.",
								 "The best way to predict the future is to invent it",
								 "ThisSentenceHasNoSpaces",
								 "You're gonna need a bigger boat",
								 "Code never lies, comments sometimes do.",
								 "Computer Science is no more about computers than astronomy is about telescopes - E. Dijkstra"};

		// Queue testing
		q.enqueue("FAIL");
		q.enqueue("FRONTTESTGOOD");
		q.enqueue("the");
		q.enqueue("LinkedQueue");
		q.dequeue();
		q.enqueue("works!");
		
		System.out.println("\n\n=============== QUEUE TESTING ===============");
		System.out.println("Queue toString():\n------------ \n" + q + "\n------------\n");
		System.out.println("Queue size: " + q.size());
		System.out.println("Queue front: " + q.first());
		q.dequeue();
		System.out.print("Queue dequeue test: " + q.dequeue() + " ");
		while (!q.isEmpty()) {
			System.out.print(q.dequeue() + " ");
		}
		
		// Stack testing
		s.push("works");
		s.push("LinkedStack");
		s.push("FAIL");
		s.pop();
		s.push("The");
		s.push("Wrong");
		s.pop();
		
		System.out.println("\n\n=============== STACK TESTING ===============");
		System.out.println("Stack toString():\n------------ \n" + s + "\n------------\n");
		System.out.println("Stack size: " + s.size());
		s.push("PEEKTESTGOOD");
		System.out.println("Stack peek: " + s.peek());
		s.pop();
		System.out.print("LinkedStack pop test : " + s.pop() + " ");
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}	

		System.out.println("\n\n=============== FUNCTION TESTING ===============");
		System.out.println("----- isPalindrome() testing -----");
		for (String str : testStrings1) {
			if (StackQueueUtil.isPalindrome(str)) {
				System.out.println("  TRUE: " + str + " is a palindrome.");
			}
			else {
				System.out.println("  FALSE: " + str + " is a NOT palindrome.");
			}
		}

		System.out.println();
		System.out.println("----- reverseWords() testing -----");
		for (String str : testStrings2) {
			System.out.println(StackQueueUtil.reverseWords(str));
		}

		System.out.println();
		System.out.println("----- checkArrays() testing -----");
		int test1a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int test1b[] = {4, 3, 2, 1, 5, 10, 9, 8, 6, 7};
		int test2a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int test2b[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		if (StackQueueUtil.checkArrays(4, 6, test1a, test1b)) {
			System.out.println("Arrays test1a & test1b are valid");
		}
		else {
			System.out.println("Arrays test1a & test1b are NOT valid");
		}
		if (StackQueueUtil.checkArrays(4, 6, test2a, test2b)) {
			System.out.println("Arrays test2a & test2b are valid");
		}
		else {
			System.out.println("Arrays test2a & test2b are NOT valid");
		}
		
	}
	
}