package activity6;

public class Activity6 {

	public static void main(String[]args) {
		
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		LinkedList<Boolean> list3 = new LinkedList<Boolean>();
		LinkedList<String> list4 = new LinkedList<String>();
		
		LinkedListTeam<LinkedList> team1 = new LinkedListTeam<LinkedList>();
		LinkedListTeam<LinkedList> team2 = new LinkedListTeam<LinkedList>();
		
		String search;
		
		
		System.out.println("Testing List: ");
		
		list.addToFront("This");
		list.addToFront("sentence");
		list.addToFront("should");
		list.addToFront("be");
		list.addToFront("backwards");
		
		list2.addToFront(10);
		list2.addToFront(15);
		list2.addToFront(20);
		
		list3.addToFront(false);
		list3.addToFront(false);
		list3.addToRear(true);
		
		list4.addToFront("Is this working?");
		list4.addToRear("Yes it is!");
		
		System.out.println(list.toString());
		
		while(!list.isEmpty()) {
		list.removeFirst();
		}
		
		System.out.println(list.toString());
		
		list.addToRear("This");
		list.addToRear("sentence");
		list.addToRear("should");
		list.addToRear("be");
		list.addToRear("forwards");
		
		search = "should";
		
		if(list.contains("should")) {
		System.out.println("Should is contained in the list at index "+ list.indexOf("should"));
		}
		else {
			System.out.println(search + " is not contained in the list");
		}
		
		search = "else";
		if(list.contains(search)) {
		System.out.println(search + " is contained in the list at index "+ list.indexOf("should"));
		}
		else {
			System.out.println(search + " is not contained in the list");
		}
		
		
		
		team1.add(list);
		team1.add(list2);
		team1.add(list3);
		team1.add(list4);
		
		team2.add(list3);
		team2.add(list);
		team2.add(list4);
		team2.add(list2);
		
		System.out.println("\nPrint the loaded teams: ");
		
		System.out.println("Team 1: \n" + team1.team.toString() + "\n");
		System.out.println("Team 2:\n" + team2.team.toString());
	}
	
}
