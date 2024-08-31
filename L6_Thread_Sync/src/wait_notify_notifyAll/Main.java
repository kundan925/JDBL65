package wait_notify_notifyAll;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg=new Message("Hello World");
		
		WiatRunnable wait=new WiatRunnable(msg);
		new Thread(wait, "Wait Thread").start();
		
		WiatRunnable wait2=new WiatRunnable(msg);
		new Thread(wait2, "Wait 2 Thread").start();
		
		NotifyRunnable notify=new NotifyRunnable(msg);
		new Thread(notify, "Notify Thread").start();
		
		System.out.println("Main ended.");
	}

}
