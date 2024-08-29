package List;

import java.util.Comparator;

public class RollStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		if(o1.roll>o2.roll) {
			return 1;
		}else if(o1.roll<o2.roll) {
			return -1;
		}
		return 0;
	}

	

}
