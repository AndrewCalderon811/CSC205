package jsjf;

public class HeapQueue<T> implements QueueADT<T> {

	ArrayHeap<ArrivalObject<T>> hqueue = new ArrayHeap<ArrivalObject<T>>();
	@Override
	public void enqueue(T element) {
		ArrivalObject<T> obj = new ArrivalObject<T>(element);
		hqueue.addElement(obj);
	}

	@Override
	public T dequeue() {
		ArrivalObject<T> obj = (ArrivalObject<T>)hqueue.removeMin();
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
