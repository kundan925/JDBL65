package ExceptionHandling;

import java.security.PublicKey;

public class Dividemain {

	public static void main(String[] args) throws Exception {
		System.out.println("Before Try Catch");
		test1();
		System.out.println(test());
		try {
			System.out.println("Divide By Zero"+10/0);
		}catch(NullPointerException e){
			e.printStackTrace();
	
		}catch (ArithmeticException e) {
			if(e.getMessage().equals("/ by zero") ){
				System.out.println("Hey budyy!");
			}
		}catch (Exception e) {
			
		}
		System.out.println("After Try Catch Block");
	}
		
		public static String test() {
			try {
				System.out.println("How are you! "+10);
				return "Try Test";
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				return "From Finally";
			}
		
	}
		public static void test1() throws Exception{
			
				System.out.println("How are you! "+10/0);
				
		}


}
