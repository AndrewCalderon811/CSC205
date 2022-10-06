package project4;

public class Recursion {
	
    // Activity 4 
    public static int fib (int n)
    {
        if(n <= 1)
        {
        	return 1;
        }
        else
    	{
    		return (n + (fib(n-1)));
    	}
    }
     
    public static int power (int x, int y)
    {
    	if(y<=1) 
    	{
    		return 1;
    	}
    	else 
    	{
    		
    		return (x * power(x, y-1));
    	}
    }
     
    public static int ackermann(int m, int n)
    {
        if(m == 0) 
        {
        	return n+1;
        }
        else if(m > 0 && n == 0) 
        {
        	return ackermann(m-1, 1);
        }
        else if(m > 0 && n > 0)
        {
        	return (ackermann((m-1), ackermann(m, n-1)));
        }
        else
        	return 0;
        //may cause problems
    }

    public static void triangle(int height)
    {
    	triangle(height, 1);
    }
    public static void triangle(int height, int row) 
    {
    	if(row <= height) 
    	{
    		printRow(row);
    		triangle(height, row + 1);
    	}
    	else if(height >= 0)
    	{
    		printRow(height-1);
    		triangle(height - 1, row);
    	}
    }
    
    
    private static void printRow(int n) 
    {
    	for(int i = 0; i < n; i++)
    	System.out.print("*");
    	System.out.println();
    }

    // Project 4
    public static int balance (int x, int y)
    {
    	//makes sure that x is always the smaller integer
        if(x > y) 
        {
        	return balance(y,x);
        }
        else if(x <= y)
        {
        	if(((x + 1) == (y - 1)) || ((x+1) == y) || x == y) 
        	{
        		return x;
        	}
        	else
        	{
        		return balance((x+1), y-1);
        	}
        }
        else 
        	return 0;
    }
    
	public static double pi_approximation(int n)
	{
		return 4 * pi_approximation(n, 4);
	}
	
	//p is just a placeholder to create a helper method
	private static double pi_approximation(int n, int p) 
	{
		if(n <= 1) 
		{
			return 1;
		}
		else 
		{
			return (pi_approximation(n-1, p) - ((double)power(-1, (n+1)) / ((2 * n) - 1)));
		}
	}
	

	public static boolean isPalindrome(String s)
	{
		if(reverseString(s).equals(s)) 
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	private static String reverseString(String s) 
	{
		if(s.length() <= 1) 
		{
			return s;
		}
		else
		{
			return (reverseString(s.substring(1)) + s.charAt(0));
		}
	}
		
	public static boolean monotonicallyIncreasing(Integer[] a)
	{
		boolean ret = false;
		if(monotonicallyIncreasing(a, 1) == 0)
		{
			ret = true;
		}
		else if(monotonicallyIncreasing(a, 1) == 1) 
		{
			ret = false;
		}
		return ret;
	}
	private static int monotonicallyIncreasing(Integer[] a, int index)
	{
		if(index >= a.length || index == a.length)
		{
			return 0;
		}
		else 
		{
			if(a[index] >= a[index-1]) 
			{
				return monotonicallyIncreasing(a, index+1);
			}
			else
			{
				return 1;
			}
		}
		
	}
	
	
	
}