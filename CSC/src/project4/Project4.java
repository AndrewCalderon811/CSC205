package project4;

import java.util.Arrays;
import java.util.List;

//import projects.project4.csc205.Recursion;

public class Project4 {

	public static void main(String[] args) {
		List<Integer> testValues = Arrays.asList(1, 5, 10, 20);
		
		System.out.println("Activity 4 Testing:");

		// Test Fibonacci
		System.out.println();
		System.out.println("Fibonacci:");
		System.out.print("  ");
		for (Integer ii : testValues) {
			System.out.print(Recursion.fib(ii) + "   ");
		}
		System.out.println();

		// Test power function
		System.out.println();
		System.out.println("Power:");
		for (Integer ii : testValues) {
			System.out.print("  ");
			for (int jj = 0; jj<6; jj ++)  {
				System.out.print(ii + "^" + jj + "=" + Recursion.power(ii,jj) + "   ");
			}
			System.out.println();
		}

		// Test the Ackermann function 
		System.out.println();
		System.out.println("Ackermann:");
		testValues = Arrays.asList(1, 2, 3);
		for (Integer ii : testValues)
		{
			System.out.print("  ");
			for (int jj = 0; jj < 5; jj++)
			{
				System.out.print(Recursion.ackermann(ii,jj) + "\t");
			}
			System.out.println();
		}
		
		// Test triangle method
		System.out.println();
		System.out.println("Triangle");
		Recursion.triangle(2);
		System.out.println();
		Recursion.triangle(4);
		

		System.out.println();
		System.out.println("Project 4 Testing:");

		// Test balance function 
		System.out.println("Balance:");
		System.out.print("  ");
		System.out.print("[10 20]: " + Recursion.balance(10, 20) + "    ");
		System.out.print("[20 10]: " + Recursion.balance(20, 10) + "    ");
		System.out.print("[10 21]: " + Recursion.balance(10, 21) + "    ");
		System.out.println();
		System.out.print("  ");
		System.out.print("[21 10]: " + Recursion.balance(21, 10) + "    ");
		System.out.print("[10 10]: " + Recursion.balance(10, 10) + "    ");
		System.out.print("[10 11]: " + Recursion.balance(10, 11) + "    ");
		System.out.println();

		// Test the Pi approximation function 
		System.out.println();
		testValues = Arrays.asList(5, 20, 50);
		System.out.println("Pi:");
		System.out.print("  ");
		for(Integer ii : testValues) {
			System.out.print("[" + ii + "] : " + 
					String.format("%.3f", Recursion.pi_approximation(ii)) +
					"     ");
		}
		System.out.println();

		System.out.println();
		System.out.println("isPalindrome:");
		String[] testStrings = {"a", "ab", "aa", "aba", "aabcbaa" , "aabbccbbaa", "notapalindrome"};
		for (String str : testStrings) {
			if (Recursion.isPalindrome(str)) {
				System.out.println("  " + str + " is a palindrome.");
			}
			else {
				System.out.println("  " + str + " is a NOT palindrome.");
			}
		}
		
		System.out.println();
		System.out.println("monotonicallyIncreasing:");
		Integer[][] testArrays = {{1}, {1, 2, 3}, {3, 2, 1} , {1, 2, 3, 1}, {9, 8, 7}, {1, 2}, {2, 1}};
		for (Integer[] a : testArrays) {
			if (Recursion.monotonicallyIncreasing(a)) {
				System.out.print("  ");
				printArray(a);
				System.out.println(" is monotonically increasing.");
			}
			else {
				System.out.print("  ");
				printArray(a);
				System.out.println(" is NOT monotonically increasing.");
			}
		}
	}
	
	public static void printArray(Integer[] a) {
		for (int ii=0;ii<a.length;ii++) {
			 System.out.print(a[ii].toString() + " ");
		}
	}
}