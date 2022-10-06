package activity2;

import java.util.Scanner;

/**
 * Driver class for CSC205 Activity 2
 * 
 * @author Wade Huber
 *
 */
public class Activity2 {

	public static void main(String[] args) {

		Fraction sampleFraction = new Fraction(8,3);
		
		Scanner scan = new Scanner(System.in);

		
		try 
		{
			System.out.print ("Enter the numerator:  ");
			sampleFraction.setNumerator(scan.nextInt());	
			System.out.print ("Enter the denominator:  ");
			sampleFraction.setDenominator(scan.nextInt());	
	
			System.out.println ("The fraction " + sampleFraction.getNumerator() + "/" +
			sampleFraction.getDenominator() + " is equal to " + sampleFraction.toMixedNumber());
		}
		catch(ArithmeticException excep)
		{
			System.err.println("Dividing by zero is not allowed");
		}
	
		catch(java.util.InputMismatchException excep) 
		{
			System.err.println("You can only enter numbers");
		}
		
		
		scan.close();

	}
}