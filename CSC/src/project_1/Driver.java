package project_1;

public class Driver {
	public static void main(String[] args) {
		Point p1 = new Point(7,0);
		Point p2 = new Point(-4, -8);
		Point p3 = new Point(4, 3);
		
		System.out.println("Point 1: " + p1);
		System.out.println("Point 2: " + p2);
		System.out.println("Distance between " + p1 + " and " + 
				p2 + ": " + p1.distance(p2));
		p1.shiftX(10);
		p2.shiftX(-4); 
		p1.shiftY(-6);
		p2.shiftY(9); 
		System.out.println("\nAfter shift:");
		System.out.println("Point 1: " + p1);
		System.out.println("Point 2: " + p2);
		System.out.println("Distance: " + p1.distance(p2));
		System.out.println("\nRotate test:");
		System.out.println("Before rotate: Point 3: " + p3);
//		p3.rotate(Math.PI / 2);
		System.out.println(" After rotate: Point 3: " + p3);
	}

}