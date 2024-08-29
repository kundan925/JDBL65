package List;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(11, "Kundan", 85);
		Student s2=new Student(28, "Ashish", 95);
		Student s3=new Student(35, "Gautam", 90);
		Student s4=new Student(89, "Gautam", 60);
		Student s5=new Student(67, "Gautam", 75);
		Student s6=new Student(54, "Gautam", 55);
		Student s7=new Student(19, "Gautam", 50);
		
		ArrayList<Student> studentArray = new ArrayList<Student>();
		
		studentArray.add(s1);
		studentArray.add(s2);
		studentArray.add(s3);
		studentArray.add(s4);
		studentArray.add(s5);
		studentArray.add(s6);
		studentArray.add(s7);
		
		for (Student student : studentArray) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println();
		Collections.sort(studentArray);
		
		for (Student student : studentArray) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println();
		Collections.sort(studentArray,new RollStudentComparator());
		
		for (Student student : studentArray) {
			System.out.println(student);
		}
		
	}

}
