package ExceptionHandling;

public class User {
	String name;
	int age;
	String email;
	
	public void register(String name,int age,String email) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age is less than 18.");
		}else {
			this.name=name;
			this.age=age;
			this.email=email;
			
		}
	}
	public void printUser() {
		System.out.println("User Name "+name+", User age "+age+", User email "+email);
	}
}
