package activity5;

import project3.characters.*;

public class Activity5 {

	public static void main(String[] args) {
		
		ArrayListTeam<GameCharacter> team1 = new ArrayListTeam<GameCharacter>();
		ArrayListTeam<GameCharacter> team2 = new ArrayListTeam<GameCharacter>();
		
		int team1Attack = 0;
		int team2Attack = 0;
		
		team1.add(new Warrior("Tom Hanks",3,8,5));
		team1.add(new Warrior("Kratos",50,50,1));
		team1.add(new Mage("Criss Angel",1,10,4));
		team1.add(new Archer("Hawkeye",2,8,2));
		team1.add(new Warrior("The Undertaker",5,5,5));
		
		team2.add(new Mage("Charlotte Brereton",5,1,9));
		team2.add(new Mage("Carlisle",50,50,4));
		team2.add(new Assassin("Agent 47",5,8,9));
		team2.add(new Archer("Katniss Everdeen",5,7,6));
		team2.add(new Archer("My coworker jonathan",4,1,10));
		
//		for(int i=0; i<team1.size(); i++) {
//			
//			team1Attack = team1Attack + (team1.team.get(i)).attack();
//			
//		}
		
		
		
		team1.iterator().next().attack();
		
		for(int i=0; i<team2.size(); i++) {
			
			team2Attack = team2Attack + (team2.team.get(i)).attack();
			
		}
	
		if(team1Attack > team2Attack) {
			System.out.println("Team 1 has the strongest attack at: " + team1Attack);
		}
		else if(team1Attack == team2Attack) {
			System.out.println("Both teams have the same attack at: " + team1Attack);
		}
		else {
			System.out.println("Team 2 has the strongest attack at: " + team2Attack);
		}
		
	}
		
		
}