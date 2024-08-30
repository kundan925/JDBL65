
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSample ts=new ThreadSample();
		ts.setDaemon(true); //* This Thread will run lastly most of the cases
		ts.start();
		
		
		Table t=new Table(5);
		Thread td=new Thread(t,"Thread - Table of 5");
		td.start();
		
		Table t7=new Table(7);
		Thread td7=new Thread(t7, "Thread - Table of 7");
		td7.start();
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Main "+i);
		}
	}

}
