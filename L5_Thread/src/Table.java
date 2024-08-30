
public class Table implements Runnable{
	int num;
	public Table() {
		super();
	}
	
	public Table(int num) {
		super();
		this.num = num;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<11;i++) {
			System.err.println(num+" X "+i+" = "+num*i);
		}
	}
	
}
