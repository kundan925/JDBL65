package wait_notify_notifyAll;

public class WiatRunnable implements Runnable{
	private Message msg;
	
	public WiatRunnable(Message msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		synchronized (msg) {
			System.out.println("Thread "+name+" Waiting for notification : "+System.currentTimeMillis());
			try {
				msg.wait(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+name+" Got the notification : "+System.currentTimeMillis());
			System.out.println("Thread "+name+" Message : "+msg.getMsg());
		}
	}

}
