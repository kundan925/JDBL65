package List;

public class Student implements Comparable<Student>{
	int roll;
	String name;
	double perc;
	public Student(int roll, String name, double perc) {
		super();
		this.roll = roll;
		this.name = name;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", perc=" + perc + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.perc>o.perc) {
			return 1;
		}else if(this.perc<o.perc) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
