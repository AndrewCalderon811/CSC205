package activity5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTeam<T> implements Team<T> {
	
	ArrayList<T> team;
	
	public ArrayListTeam() {
		super();
		team = new ArrayList<T>();
	}


	@Override
	public Iterator<T> iterator() {
		return team.iterator();
	}

	@Override
	public boolean isEmpty() {
		return team.isEmpty();
	}

	@Override
	public int size() {
		return team.size();
	}

	@Override
	public void add(T t) {
		team.add(t);
	}

	@Override
	public String toString() {
		return "Box [item=" + team + "]";
	}
}