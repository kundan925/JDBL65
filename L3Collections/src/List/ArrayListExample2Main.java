package List;

import java.util.ArrayList;

public class ArrayListExample2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		marksList.add(10);
		marksList.add(20);
		marksList.add(30);
		marksList.add(40);
		marksList.add(50);
		marksList.add(60);
		
		
		for (Integer integer : marksList) {
			System.out.println(integer);
		}
		
	}

}
