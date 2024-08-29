package HashMapExample;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student, Integer> hashMap = new HashMap<Student, Integer>();
		
		Student s1=new Student(1, "Kundan");
		Student s2=new Student(1, "Kundan");
		Student s3=new Student(2, "Hena");
		Student s4=new Student(3, "Ashish");
		
		hashMap.put(s1, 100);
		hashMap.put(s2, 90);
		hashMap.put(s3, 80);
		hashMap.put(s4, 70);
		
		System.out.println("Hash Map size "+hashMap.size());
		System.out.println(s1.equals(s2));
	}

}
