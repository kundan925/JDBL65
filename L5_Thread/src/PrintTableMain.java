
public class PrintTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table(5);
		
		Thread td=new Thread(t,"Thread - Table of 5");
		
		td.start();
		//td.setPriority(10); //**setting priority of thread doesn't mean it will execute first
		System.out.println(td.getId());
		System.out.println(td.getName());
		
		Table t7=new Table(7);
		
		Thread td7=new Thread(t7, "Thread - Table of 7");
		td7.start();
		System.out.println(td7.getId());
		System.out.println(td7.getName());
		
		
	}

}
