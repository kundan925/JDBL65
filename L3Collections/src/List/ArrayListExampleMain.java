package List;

import java.util.ArrayList;

public class ArrayListExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nameList= new ArrayList<String>();
		System.out.println("Size of ArrayList is "+nameList.size());
		nameList.add("Kundan");
		nameList.add("Ashish");
		nameList.add("Gautam");
		nameList.add("Prashant");
		nameList.add("Kundan");
		
		nameList.remove("Kundan");
		nameList.remove(0);
		for (String string : nameList) {
			System.out.println(string);
		}
	
	}

}
