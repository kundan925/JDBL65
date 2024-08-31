package Sync;

public class MyThread extends Thread{
	School school;
	String name;
	public MyThread(School school, String name) {
		super();
		this.school = school;
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		school.display();
		
	}
}
