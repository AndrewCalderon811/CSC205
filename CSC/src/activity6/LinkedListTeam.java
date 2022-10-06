package activity6;

import java.util.Iterator;
import project5.Team;

public class LinkedListTeam<T> implements Team<T> {
	
	LinkedList<T> team;

	public LinkedListTeam() {
		super();
		team = new LinkedList<T>();
	}
	
	@Override
	public Iterator<T> iterator() {
		
		return team.iterator();
	}

	@Override
	public void add(T item) {
		team.addToFront(item);
	}

	@Override
	public boolean isEmpty() {
		return team.isEmpty();
	}

	@Override
	public int size() {
		return team.size();
	}

}
