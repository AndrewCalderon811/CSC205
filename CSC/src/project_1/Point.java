package project_1;

public class Point 
{
	private double x, y;
	
	public Point(double x2, double y2) 
	{
		x = x2;
		y = y2;
	}

	public String toString() 
	{
		return "(" + x + ", " + y + ")";
	}
	
	public void shiftX(double n) 
	{
		x = x + n;
	}
	
	public void shiftY(double n) 
	{
		y = y + n;
	}
	
	//Use a holder variable to "Store" the y value while x swaps
	public void swap() 
	{
		double hold = y;
		y = x;
		x = hold;
	}
	
	public double distance() 
	{
		return Math.sqrt((x*x)+(y*y));
	}
	
	public double distance(Point p2) 
	{
		return Math.sqrt(((p2.x - x) * (p2.x - x)) + ((p2.y - y) * (p2.y - y)));	
	}
	
	public double getX() 
	{
		return x;
	}
	
	public double gety() 
	{
		return y;
	}
	
	public void rotate(double d) 
	{
		x = ((x * Math.cos(d)) - (y * Math.sin(d)));
		y = ((x * Math.sin(d)) + (y * Math.cos(d)));
	}
	
}
