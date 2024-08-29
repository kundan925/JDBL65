package ExceptionHandling;

public class UserDefineCustomExampleMain {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		User u=new User();
		try {
			u.register("Kundan", 15, "kundan@example.com");
			u.printUser();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			u.register("Ashish", 45, "ashish@example.com");
			u.printUser();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
