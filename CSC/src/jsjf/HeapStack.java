package jsjf;

public class HeapStack<T> implements StackADT<T> {

	
	ArrayHeap<ArrivalObjectStack<T>> hstack = new ArrayHeap<ArrivalObjectStack<T>>();
	@Override
	public void push(T element) {
		ArrivalObjectStack<T> obj = new ArrivalObjectStack<T>(element);
		hstack.addElement(obj);;
		
	}

	@Override
	public T pop() {
		ArrivalObjectStack<T> obj = (ArrivalObjectStack<T>)hstack.removeMin();
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
