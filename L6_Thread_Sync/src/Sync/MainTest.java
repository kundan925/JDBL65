package Sync;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sch1=new School("School-1 ");
		School sch2=new School("School-2 ");
		
		MyThread t1=new MyThread(sch1, "Kundan");
		MyThread t2=new MyThread(sch2, "Hena");
		
		t1.start();
		t2.start();
	}

}
