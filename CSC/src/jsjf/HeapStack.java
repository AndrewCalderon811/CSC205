package jsjf;

public class HeapStack<T> implements StackADT<T> {

	
	ArrayHeap<ArrivalObject<T>> hstack = new ArrayHeap<ArrivalObject<T>>();
	@Override
	public void push(T element) {
		ArrivalObject<T> obj = new ArrivalObject<T>(element);
		hstack.addElement(obj);
		
	}

	@Override
	public T pop() {
		ArrivalObject<T> obj = (ArrivalObject<T>)hstack.removeMin();
		return obj.getElement();
	}

	@Override
	public T peek() {
		return hstack.findMin().getElement();
	}

	@Override
	public boolean isEmpty() {
		return hstack.isEmpty();
	}

	@Override
	public int size() {
		return hstack.size();
	}
	
}
