package SingletonExample;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton.getInstance();
		// TODO Auto-generated method stub
		Singleton.dbConnect();
		Singleton.getInstance();
		Singleton.dbConnect();
	}

}
