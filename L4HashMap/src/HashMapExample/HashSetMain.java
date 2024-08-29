package HashMapExample;


import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> st=new HashSet<Student>();
		
		Student s1=new Student(1, "Kundan");
		Student s2=new Student(1, "Kundan");
		Student s3=new Student(2, "Ashish");
		Student s4=new Student(3, "Hena");
		Student s5=new Student(4, "Gautam");
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		System.out.println("Hash Set Size : "+st.size());
		System.out.println(st);
	}

}
