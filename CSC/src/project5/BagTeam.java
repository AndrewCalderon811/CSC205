package project5;

import java.util.Iterator;

public class BagTeam<T> implements Team<T>, Iterable<T> {
	
	MyBag<T> team;
	
	public BagTeam() {
		super();
		team = new MyBag<T>();
	}

	@Override
	public Iterator<T> iterator() {
		return team.iterator();
	}

	@Override
	public void add(T item) {
		team.add(item);
		
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