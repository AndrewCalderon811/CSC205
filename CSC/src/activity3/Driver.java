package activity3;

public class Driver {


	public static void main(String[] args) {
		Task shop = new Task();
		Task homework = new Task();
		
		shop.setpriority(4);
		System.out.println("Go shopping is priority " + shop.getPriority());
		homework.setpriority(1);
		System.out.println("Do homework is priority " + homework.getPriority());

	}

}
