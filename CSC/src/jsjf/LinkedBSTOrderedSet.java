package jsjf;

import java.util.Iterator;


public class LinkedBSTOrderedSet<T> implements OrderedSetADT<T>{
	
	LinkedBinarySearchTree<T> t = new LinkedBinarySearchTree<T>();

	public LinkedBSTOrderedSet() {
		super();
	}

	@Override
	public void addElement(T element) {
//		if(!contains(element)) {
//			t.addElement(element);
//		}
	}
	
	
	@Override
	public T removeElement(T targetElement) {
		return t.removeElement(targetElement);
	}
	
	@Override
	public T find(T targetElement) {
		return t.find(targetElement);
	}

	@Override
	public T findMin() {
		return t.findMin();
	}

	@Override
	public T findMax() {
		return t.findMax();
	}

	@Override
	public boolean contains(T targetElement) {
		boolean ret = false;
		
		if(!t.isEmpty() && find(targetElement) != null) {
			ret = true;
		}
		
		return ret;
	}

	@Override
	public Iterator<T> iterator() {
		return t.iterator();
	}
	
	 
}
