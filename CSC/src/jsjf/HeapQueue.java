package jsjf;

public class HeapQueue<T> implements QueueADT<T> {

	ArrayHeap<ArrivalObjectQueue<T>> hqueue = new ArrayHeap<ArrivalObjectQueue<T>>();
	@Override
	public void enqueue(T element) {
		ArrivalObjectQueue<T> obj = new ArrivalObjectQueue<T>(element);
		hqueue.addElement(obj);
	}

	@Override
	public T dequeue() {
		ArrivalObjectQueue<T> obj = (ArrivalObjectQueue<T>)hqueue.removeMin();
		return obj.getElement();
	}

	@Override
	public T first() {
		return hqueue.findMin().getElement();
	}

	@Override
	public boolean isEmpty() {
		return hqueue.isEmpty();
	}

	@Override
	public int size() {
		return hqueue.size();
	}


}
