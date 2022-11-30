package jsjf;

public class ArrivalObjectStack<T> implements Comparable<ArrivalObjectStack<T>>{
	
	private static int nextOrder = 0;
	private int arrivalOrder;
	private T element;
	
	
	public ArrivalObjectStack(T element) {
		
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
	
	public int compareTo(ArrivalObjectStack<T> obj) {
		int result;
		
		if(arrivalOrder > obj.getArrivalOrder()) {
			result = -1;
		}
		else {
			result = 1;
		}
		
		return result;
	}

}
