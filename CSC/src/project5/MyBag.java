package project5;

import java.util.ArrayList;
import java.util.Iterator;

public class MyBag<T> implements Bag<T> {
	
	ArrayList<T> bag;
	
	public MyBag() {
		super();
		bag = new ArrayList<T>();
	}
	
	@Override
	public Iterator<T> iterator() {
		return bag.iterator();
	}

	@Override
	public boolean isEmpty() {
		return bag.isEmpty();
	}

	@Override
	public int size() {
		return bag.size();
	}

	@Override
	public void add(T item) {
		bag.add(item);
	}

	@Override
	public String toString() {
		return "MyBag [bag=" + bag + "]";
	}

}