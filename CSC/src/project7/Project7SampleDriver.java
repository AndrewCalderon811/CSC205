package project7;

import java.util.List;
import java.util.Random;

import project7.*;

public class Project7SampleDriver {

		public final static int LENGTH = 30;
		
		public static void main(String[] args) {
			Integer a[] = new Integer[LENGTH];

			a = generateRandomArray(LENGTH);

		    // Test sort()
		    System.out.println("Testing sort():");
		    System.out.print("    Before sorting: ");
		    printArray(a);
		    Sorting.sort(a);
		    System.out.print("    After sorting: ");
		    printArray(a);
		    testSortedArray(a);
		    System.out.println();

		    // test cutoff_qsort
		    System.out.println("Testing cutoff_sort():");
			Integer sortup[] = {1,2,3,4,5,6,7,8,9,10,11};
			Integer sortdown[] = {11,10,9,8,7,6,5,4,3,2,1};

		    System.out.print("    Before sorting: ");
		    printArray(sortup);
		    Sorting.cutoffQsort(sortup);
		    System.out.print("    After sorting: ");
		    printArray(sortup);
		    testSortedArray(sortup);

		    System.out.print("    Before sorting: ");
		    printArray(sortdown);
		    Sorting.cutoffQsort(sortdown);
		    System.out.print("    After sorting: ");
		    printArray(sortdown);
		    testSortedArray(sortdown);

		    for (int ii=0;ii<5;ii++) {
		    	a = generateRandomArray(LENGTH);
		       	System.out.print("    Before sorting: ");
		       	printArray(a);
		       	Sorting.cutoffQsort(a);
		       	System.out.print("    After sorting: ");
		       	printArray(a);
		       	testSortedArray(a);
		    }
	      	System.out.println();
		    
			Integer m1[] = {10, 5, 15, 4, 14, 3, 13, 2, 12};
			Integer m2[] = {5, 15, 4, 14, 3, 13, 2, 12, 10};
			Integer m3[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
			Integer m4[] = {20, 15, 10, 1};
			Integer m5[] = {1, 2, 3, 3, 2, 1};

		    // closest pair()
		    System.out.println("\nTesting closestPair()");
			a = generateRandomArray(LENGTH);
			System.out.println("    Closest pair a = " + Sorting.closestPair(a));
			System.out.println("    Closest pair m1 = " + Sorting.closestPair(m1));
			System.out.println("    Closest pair m2 = " + Sorting.closestPair(m2));
			System.out.println("    Closest pair m3 = " + Sorting.closestPair(m3));
			System.out.println("    Closest pair m4 = " + Sorting.closestPair(m4));
			System.out.println("    Closest pair m5 = " + Sorting.closestPair(m5));
		    
		    // firstN() 
		    System.out.println("\nTesting firstN()");
		    for (int ii=0;ii<3;ii++) {
		    	a = generateRandomArray(LENGTH);
  			    System.out.println("    First 2 of random array " + (ii+1) + ": " +  Sorting.firstN(a,2));
  			    System.out.println("    First " + 3*(ii+1) + " of random array " + (ii+1) + ": "  +  Sorting.firstN(a,3*(ii+1)));
		    }
			Integer ntest1[] = {3, 9, 6, 4, 1, 8, 2, 7 ,5};
			Integer ntest2[] = {1, 2, 1, 2, 1, 2, 1, 2};
			System.out.println("    First 2 of test1: "  + Sorting.firstN(ntest1, 2));
			System.out.println("    First 6 of test1: "  + Sorting.firstN(ntest1, 6));
			System.out.println("    First 2 of test2: "  + Sorting.firstN(ntest2, 2));
			System.out.println("    First 6 of test2: "  + Sorting.firstN(ntest2, 6));

		    System.out.println("\nTesting shuffle():");
			Deck d = new Deck(52);
			System.out.print("       Before shuffle: ");
			System.out.println(d);
			d.shuffle();
			System.out.print("    After 1st shuffle: ");
			System.out.println(d);
			d.shuffle();
			System.out.print("    After 2nd shuffle: ");
			System.out.println(d);

		}
		
		// ----------- Helper functions --------------
		public static void printArray(Object[] a) {
			for (int ii=0;ii<a.length;ii++) {
				System.out.print (a[ii] + " ");
			}
			System.out.println();
		}
		
		public static Integer[] generateRandomArray(int len) {
			Integer[] a = new Integer[len];
			Random rand = new Random();
		    for (int ii=0;ii<a.length;ii++) {
		    	a[ii] = rand.nextInt(1000);
		    }			
		    return a;
		}
		
		public static <T extends Comparable<T>>  
		void testSortedArray(T[] a) {
			if (Sorting.isSorted(a)) {
				System.out.println("The array is sorted!");
			}
			else {
				System.out.println("The array is NOT sorted!");
			}
		}
}