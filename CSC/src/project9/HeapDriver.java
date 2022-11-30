package project9;

import jsjf.ArrayHeap;
import jsjf.HeapQueue;
import jsjf.HeapStack;

public class HeapDriver {

	public static void main(String[]args) {
		
		String sentance[] = {"This", "is", "my", "heaps", "project", "for", "CSC205"};
		ArrayHeap<String> arrayHeap = new ArrayHeap<String>();
		HeapStack<String> stackHeap = new HeapStack<String>();
		HeapQueue<String> queueHeap = new HeapQueue<String>();
		
		System.out.println(Sorting.smallest_n(sentance, 4));
		
		for(String s : sentance) {
			stackHeap.push(s);
			queueHeap.enqueue(s);
		}
		
		System.out.println("\nBegin Stack testing: \n");
		
		while(!stackHeap.isEmpty()) {
			System.out.println(stackHeap.pop());
		}
		
		System.out.println("\n--Finished testing Stack-- \nBegin Queue Testing: \n");
		
		while(!queueHeap.isEmpty()) {
			System.out.println(queueHeap.dequeue());
		}
		
	}
	
	
}
