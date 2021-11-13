package Exceptions;

public class Throw {

	static void checkage(int age) {
		if (age<20) {
			throw new ArithmeticException("denied - be atleast 18 years old.");
		}
		
		else {
			System.out.println("Granted Access");
		}
	}
		
		public static void main(String[] args) {

			checkage(15);
			
		}
		
	
}
