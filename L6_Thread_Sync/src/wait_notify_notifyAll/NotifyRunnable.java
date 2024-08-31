package wait_notify_notifyAll;

public class NotifyRunnable implements Runnable{
private Message msg;
	
	public NotifyRunnable(Message msg) {
		super();
		this.msg = msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println(name+" Thread Started.");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name+" Notify will be called.");
				msg.notifyAll();
				
				//msg.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
