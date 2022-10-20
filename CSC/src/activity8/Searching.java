package activity8;

public class Searching {
	
	private static int counter = 0;
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Searching.counter = counter;
	}
	
	private static void resetCounter() {
		setCounter(0);
	}

	public static <T extends Comparable<T>>
	T linearSearch(T[] data, T target) {
		return(linearSearch(data, 0, data.length-1, target));
	}
	public static <T extends Comparable<T>>
	T linearSearch(T[] data, int min, int max, T target) {
		T ret = null;
		int current = min;
		
		resetCounter();
		
		while (current <= max) {
			counter ++;
			if(data[current].compareTo(target) == 0) {
				ret = data[current];
				break;
			}
			current ++;
		}
		return ret;
	}
	
	
	public static <T extends Comparable<T>>
	T binarySearch(T[] data, T target) {
		resetCounter();
		return(binarySearch(data, 0, data.length-1, target));
	}
	public static <T extends Comparable<T>>
	T binarySearch(T[] data, int min, int max, T target) {
		T ret = null;
		
		if(min > max) {
			return null;
		}

		int mid = min + ((max - min) / 2);
		counter ++;
		int comparisonResult = data[mid].compareTo(target);
		if (comparisonResult == 0) {
			ret = data[mid];
		}
		else if (comparisonResult > 0) {
			ret = binarySearch(data, min, mid-1, target);
		}
		else {
			ret = binarySearch(data, mid+1, max, target);
		}
		return ret;
	}
	public static <T extends Comparable<T>>
	Integer interpolationSearch(Integer[] data, Integer target) {
		resetCounter();
		return(interpolationSearch(data, 0, data.length-1, target));
	}
	public static <T extends Comparable<T>>
	Integer interpolationSearch(Integer[] data, int min, int max, Integer target) {
		Integer ret = null;
		
		if(min > max) {
			return null;
		}

		try 
		{
			int mid = min + ((max - min) * (target - data[min])) / (data[max] - data[min]);
			counter ++;
			int comparisonResult = data[mid].compareTo(target);
			if (comparisonResult == 0) {
				ret = data[mid];
			}
			else if (comparisonResult > 0) {
				ret = interpolationSearch(data, min, mid-1, target);
			}
			else {
				ret = interpolationSearch(data, mid+1, max, target);
			}
			
		}
		catch (Exception ArryIndexOutOfBoundsException) {
			
		}
		finally {
			return ret;
		}
		
	}
	
}
