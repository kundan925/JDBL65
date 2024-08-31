package Sync;

public class School {
	String name;
	public School(String string) {
		// TODO Auto-generated constructor stub
		this.name=string;
	}

	//* We can make method thread safe by using synchronized 
	public synchronized void display() {
		for(int i=0;i<5;i++) {
			System.out.println(name+" - "+i);
		}
		// * by making block synchronized
		synchronized (name) {
			for(int i=0;i<5;i++) {
				System.out.println(name+" - "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
