package project7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {
	private ArrayList<PlayingCard> cards;
	private Random rand;

	public Deck(int n) {
		super();
		rand = new Random();
		cards = new ArrayList<PlayingCard>(n);
		for (int suite = 1; suite <= 4; suite ++)
			for (int rank = 1; rank <= 13; rank ++) {
				if ((suite - 1) * 13 + rank <= n) { 
				  cards.add(new PlayingCard(rank, suite));
				}
			}
	}
	
	public PlayingCard dealOne() {
		return cards.get(rand.nextInt(52));
	}
	
	public void shuffle() {
		Integer[] r = new Integer[cards.size()];
		
		for(int ii=0; ii<r.length; ii++) {
			r[ii] = rand.nextInt(5200);
		}
		
		int min;
		
		for(int index = 0; index < r.length; index++) {
			min = index;
			for(int scan = index+1; scan < r.length; scan++) {
				if(r[scan].compareTo(r[min]) < 0) {
					min = scan;
				}
				
			}
			Integer swap = r[min];
			r[min] = r[index];
			r[index] = swap;
			
			PlayingCard sw = cards.get(min);
			cards.set(min, cards.get(index));
			cards.set(index, sw);
			
		}
	}
	
	public String toString(){
		String ret = "";
		for (PlayingCard card : cards){
			ret += card + " ";
		}
		return ret;
	}
}
