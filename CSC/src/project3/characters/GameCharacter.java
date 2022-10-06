package project3.characters;

public abstract class GameCharacter 
{
	protected String name;
	protected int health;
	protected int strength;
	private int dodge;
	
	public GameCharacter(String name, int health, int strength, int dodge)
	{
		this.name = name;
		this.dodge = dodge;
		this.health = health;
		this.strength = strength;
	}
	
	public int attack() 
	{
		return this.strength;
	}
	
	public void hit(int hit) 
	{
		if(rollDodge() == false) {
		health = health - hit;
		}
	}
	
	public boolean isAlive() 
	{
		if(this.health <= 0) 
		{
			return false;
		}
		else return true;
	}
	
	public int getHealth() 
	{
		return health;
	}
	
	public boolean rollDodge() 
	{
		if (((int)(Math.random() * 10) + 1) < this.dodge) 
		{
			return true;
		}
		else return false;
	}
	
	public String toString() 
	{
		return "Character: " + name + "\tHealth: " + health + "  Strength: " + strength + "  Agility: " + dodge;
	}
	
	public String getName() {
		return name;
	}
}
