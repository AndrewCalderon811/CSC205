package jsjf;

public class ArrivalObjectQueue<T> implements Comparable<ArrivalObjectQueue<T>>{
	
	private static int nextOrder = 0;
	private int arrivalOrder;
	private T element;
	
	
	public ArrivalObjectQueue(T element) {
		
		this.element = element;
		arrivalOrder = nextOrder;
		nextOrder++;
	}
	
	public T getElement() {
		return element;
	}
	
	public int getArrivalOrder() {
		return arrivalOrder;
	}
	
	public String toString() {
		return (element + "  " + arrivalOrder);
	}
	
	public int compareTo(ArrivalObjectQueue<T> obj) {
		int result;
		
		if(arrivalOrder > obj.getArrivalOrder()) {
			result = 1;
		}
		else {
			result = -1;
		}
		
		return result;
	}

}
