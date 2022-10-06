package project3.characters;

import java.util.Random;

//import project3.characters.*;

public class Driver 
{
	public static void main(String[] args)
	{
		GameCharacter[] fighters = new GameCharacter[4];
		
		Random random = new Random();
		
		Warrior warrior = new Warrior("Oolag the Orc", 3, 10, 7);
		Assassin assassin = new Assassin("Jason", 8, 3, 3);
		Archer archer = new Archer("Katniss Everdeen", 4, 5, 5);
		Mage mage = new Mage("Gandalf", 2, 4, 10);
		
		int eliminations = 0;		
		
		fighters[0] = warrior;
		fighters[1] = assassin;
		fighters[2] = archer;
		fighters[3] = mage;
		
		for(int i = 0; i < fighters.length; i++) 
		{
		System.out.print("Fighter " + (i+1) + ":\t");
		System.out.println(fighters[i].toString());
		}
		
		//Loop for fighting
		while(eliminations < (fighters.length - 1)) 
		{
			int attacker = random.nextInt(4);
			int defender = random.nextInt(4);
			
			while(defender == attacker || fighters[defender].isAlive() == false) 
			{
				defender = random.nextInt(4);
			}
			
			//Attack sequence
			if(fighters[defender].rollDodge() == false) 
			{
				System.out.println(fighters[attacker].name + " attacks " + fighters[defender].name);
				fighters[defender].hit(fighters[attacker].attack());
			}
			else 
			{
				System.out.println(fighters[defender].name + " dodged " + fighters[attacker].name + "'s Attack");
			}
			
			
			//Check if the defender lived or not
			if(fighters[defender].isAlive() == false)
			{
				System.out.println(fighters[defender].name + " eliminated");
				eliminations++;
			}
			
			//Check for a winner
			if(eliminations >= (fighters.length - 1))
			{
				System.out.println("The winner is...  " + fighters[attacker].name + "!");
			}
		}
	
	}
	
	
}
