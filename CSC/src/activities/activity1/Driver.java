package activities.activity1;

public class Driver {

	public static void main(String[] args) 
	{
		final int LIMIT = 5;
		Card card[] = new Card[6];
		
		for(int i = 1; i <= LIMIT; i++)
		{
			card[i] = new Card();
			System.out.println("Drawing a card");
			card[i].drawCard();
			System.out.println("Your card is the " + card[i].getFace() + " of " + card[i].getSuit());
		}
	}
}
