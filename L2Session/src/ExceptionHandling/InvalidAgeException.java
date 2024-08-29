package ExceptionHandling;

public class InvalidAgeException extends Exception{
	String message;

	public InvalidAgeException(String message) {
		super(message);
	}
	
}
