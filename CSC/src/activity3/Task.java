package activity3;

public class Task implements Priority {

	int priority;
	
	public Task() {
		
	}

	@Override
	public void setpriority(int p) {
		priority = p;
		

		
	}

	@Override
	public int getPriority() {
		
		return priority;
	}

}
