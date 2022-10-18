package activity8;
public class StudentRecord implements Comparable<StudentRecord> {
	
	private String name;
	private int studentNo;
	private double gpa;
	
	private static final int studentNoStart = 1024;
	private static int nextNum = studentNoStart;
	
	public StudentRecord(String name) {
		this(name, 0.0);
	}
	
	public StudentRecord(String name, double gpa) {
		super();
		this.name = name;
		this.studentNo = nextNum;
		nextNum++;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return  "#" + studentNo + ": Name=" + name + ", gpa=" + gpa;
	}

	@Override
	public int compareTo(StudentRecord that) {
		return this.name.compareTo(that.name);
	}

	@Override
	public boolean equals(Object that) {
		return this.name.equals(((StudentRecord)that).name);
	}

	@Override
	public int hashCode() {
		int hash;
		
		hash = studentNo - studentNoStart + 1;
		
		return hash;
	}
}
