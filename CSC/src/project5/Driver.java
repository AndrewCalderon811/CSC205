package project5;

import java.util.Iterator;

import project3.characters.*;

public class Driver {
	
	public static void main (String[]args) {
		BagTeam<GameCharacter> team1 = new BagTeam<GameCharacter>();
		BagTeam<GameCharacter> team2 = new BagTeam<GameCharacter>();
		
		team1.add(new Warrior("Tom Hanks",5,8,5));
		team1.add(new Warrior("Kratos",20,5,1));
		team1.add(new Mage("Criss Angel",8,5,4));
		team1.add(new Archer("Hawkeye",10,8,7));
		team1.add(new Warrior("The Undertaker",10,5,5));
		
		team2.add(new Mage("Charlotte Brereton",10,1,9));
		team2.add(new Mage("Carlisle",10,5,4));
		team2.add(new Assassin("Agent 47",10,8,9));
		team2.add(new Archer("Katniss Everdeen",10,7,6));
		team2.add(new Archer("My coworker jonathan",10,1,9));
		
		
		Iterator<GameCharacter> itr1 = team1.iterator();
		Iterator<GameCharacter> itr2 = team2.iterator();
		
		String winner = "";
		GameCharacter holder1 = itr1.next();	
		GameCharacter holder2 = itr2.next();
		
		int count = 1;
		
		while(itr1.hasNext()) {
			if(holder1.isAlive() == false) {
				holder1 = itr1.next();
			}
			
			if(holder1.isAlive()) {
				while(itr2.hasNext()) {
					if(holder2.isAlive() == false) {
					holder2 = itr2.next();
					}
					
					while(holder2.isAlive() && holder1.isAlive()) {
						System.out.println		("Round " + count + ": " + 
												holder1.getName() + ": HP = " + holder1.getHealth() + 
												" vs " + 
												holder2.getName() + ": HP = " + holder2.getHealth());
						holder1.hit(holder2.attack());
						if(holder1.isAlive()) {
								holder2.hit(holder1.attack());
						}
						count++;
						System.out.println		("Results: " + holder1.getName() + ": HP = " + holder1.getHealth() + 
												" vs " + holder2.getName() + ": HP = " + holder2.getHealth() + "\n");
					}
					break;
				}
				
			}
		}
		
		GameCharacter holder = null;
		
		for(GameCharacter i : team1) {
			holder = i;
		}
		
		if(holder.isAlive()) {
			winner = "Team 1";
		}
		else {
			winner = "Team 2";
		}
		
		fightOver(winner);
		
		
	}
	
	private static void fightOver(String s) {
		System.out.println("Team " + s + " wins!");
	}
	
}
