package activities.activity1;

public class Card 
{

	//Create the two variables of the card which are left private
	private String face;
	private String suit;
	
	
	//Draws a card and calls the set functions
	public void drawCard() 
	{
		setFace((int)(Math.random() * 13) + 1);
		setSuit((int)(Math.random() * 4));
	}
	
	//Checks if the input is valid then assigns a string
	public void setFace(int v) 
	{
		if(v <= 13 && v >= 1)
		{
			switch (v)
			{
			case 1: this.face = "Ace";
			break;
			case 11: this.face = "Jack";
			break;
			case 12: this.face = "Queen";
			break;
			case 13: this.face = "King";
			break;
			default: this.face = toString(v);
			break;
			}
		}
	}
	
	//Checks is the input is valid then assigns a string
	public void setSuit(int v) 
	{
		if (v <= 3 && v>= 0)
		{
			switch (v) 
			{
			case 0: this.suit = "Diamonds";
			break;
			case 1: this.suit = "Spades";
			break;
			case 2: this.suit = "Hearts";
			break;
			case 3: this.suit = "Clubs";
			break;
			}
		}
	}
	
	//Allows the private variable to be accessed 
	public String getFace() 
	{
		return face;
	}
	
	//Allows the private variable to be accessed
	public String getSuit() 
	{
		return suit;
	}
	
	//Used when the face is needed to be placed into a string, could also be used for more if needed
	public static String toString(int s)
	{
		return "" + s;
	}
	
	
	
	

}
