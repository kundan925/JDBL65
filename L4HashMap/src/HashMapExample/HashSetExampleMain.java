package HashMapExample;

import java.util.HashSet;

public class HashSetExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> countries=new HashSet<String>();
		countries.add("India");
		countries.add("US");
		countries.add("Australia");
		countries.add("New York");
		
		System.out.println("Set Size : "+countries.size());
		System.out.println(countries);
	}

}
