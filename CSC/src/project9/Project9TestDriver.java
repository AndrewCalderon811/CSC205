package project9;

import jsjf.HeapQueue;
import jsjf.HeapStack;


public class Project9TestDriver {
	
	public static void main (String args[]) {
		HeapStack<Integer> hstack = new HeapStack<Integer>();
		HeapQueue<Integer> hqueue = new HeapQueue<Integer>();
		Integer numbers[] = new Integer[10];
		
		System.out.println("Project 7 test driver");
		
		for(int ii=0;ii<10;ii++) {
			hstack.push(ii);
			hqueue.enqueue(ii);
			numbers[ii] = ii;
		}
		
		System.out.println("Top of HeapStack : " + hstack.peek());
		System.out.println("Top of HeapQueue : " + hqueue.first());
		System.out.println();

		System.out.print("HeapStack of " + hstack.size() + ": ");
		while(hstack.size() > 0) {
			System.out.print(hstack.pop() + " ");
		}
		System.out.println();

		System.out.print("HeapQueue of " + hqueue.size() + ": ");
		while(hqueue.size() > 0) {
			System.out.print(hqueue.dequeue() + " ");
		}
		System.out.println("\n");
		
		System.out.println("First 1 of " + Sorting.smallest_n(numbers, 1) + ": ");
		System.out.println("First 4 of " + Sorting.smallest_n(numbers, 4) + ": ");
		System.out.println("First 8 of " + Sorting.smallest_n(numbers, 8) + ": ");
		
	}

}
