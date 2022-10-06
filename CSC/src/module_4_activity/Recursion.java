package module_4_activity;

public class Recursion 
{
	
	public static int func1(int n) 
	{
		if(n <= 1) 
		{
			return 10;
		}
		else 
		{
			return (func1(n-1) + 3);
		}
	}
	public static double func2(int n)
	{
		if(n <= 1) 
		{
			return 1;
		}
		else 
		{
			return ((n * n) * (func2(n-1)));
		}
	}
	public static int func3(int n)
	{
		if(n <= 1) 
		{
			return -1;
		}
		else 
		{
			if((n % 2) == 0)
			{
				return (func3(n-1) + n);
			}
			else 
			{
				return (func3(n-1) + (-1 * n));
			}
		}
	}
	
	public static int func4(int n) 
	{
		if(n <= 1) 
		{
			return 1;
		}
		else if(n == 2) 
		{
			return 1;
		}
		else if(n == 3)
		{
			return 2;
		}
		else 
		{
			return ((func4(n-1)) + (func4(n-2)) + (func4(n-3)));
		}
	}
	public static int func5(int x, int y) 
	{
		if(y == 0)
		{
			return x;
		}
		else 
		{
			return func5(x+1, y-1);
		}
		
	}
	
	public static void func6(int n) 
	{
		if(n <= 1) 
		{
			System.out.print(" " + n);
		}
		else 
		{
			System.out.print(" " + n);
			func6(n-1);
			
		}
	}
	public static void func7(int n) 
	{
		if(n <= 1) 
		{
			System.out.print(" " + n);
		}
		else 
		{
			func6(n-1);
			
			System.out.print(" " + n);
		}
	}
	
	
	
	
}
