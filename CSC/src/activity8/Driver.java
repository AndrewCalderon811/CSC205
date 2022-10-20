package activity8;

public class Driver {

	
	public static void main(String[]args) {
		
		Integer result;
		Integer slots[] = new Integer[4200];
		StudentRecord s[] = new StudentRecord[5];
		
		Integer targets[] = {1, 2, 6, 2000, 10000};
		
		for(int ii=0;ii<slots.length;ii++) {
			slots[ii] = ii*2;
		}
		
		s[0] = new StudentRecord("Carrie", 1.6);
		s[1] = new StudentRecord("Jerry", 2.0);
		s[2] = new StudentRecord("Mary", 2.5);
		s[3] = new StudentRecord("Larry", 3.0);
		s[4] = new StudentRecord("Barry", 3.5);
		
//		StudentRecord studenResults = Searching.interpolationSearch(s, new StudentRecord(""));
		
		
		System.out.println("Expected search values: null, 2, 2000, null\n\nOutput:");
		
		for(Integer target : targets) {
			result = Searching.interpolationSearch(slots, target);
			System.out.println(result);
		}
		
		
		
	}
	
	
}
