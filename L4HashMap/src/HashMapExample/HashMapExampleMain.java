package HashMapExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates Hash Map of Capacity 16 and Load factor .75f
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Kundan");
		hashMap.put(12, "Ashish");
		hashMap.put(11, "Hena");
		hashMap.put(9, "Gautam");
		
		System.out.println("Size of Hash Map is "+hashMap.size());
		
		System.out.println("Vlaue at Index 11 is "+hashMap.get(11));
		
		hashMap.put(1, "Almas");
		System.out.println("Vlaue at Index 1 is "+hashMap.get(1));
		
		HashMap<Integer, String> hashMap2=new HashMap(5,0.5f);
		
		hashMap2.put(65, "A");
		hashMap2.put(66, "B");
		hashMap2.put(67, "C");
		hashMap2.put(68, "D");
		hashMap2.put(69, "E");
		hashMap2.put(70, "F");
		
		System.out.println(hashMap2.size());
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key:"+entry.getKey()+"   "+"Value:"+entry.getValue());
		}
		
	}

}
