package exception;

public class Trycatchfinally {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3/0);
		} 
		catch (ArithmeticException e) {
			
			System.out.println("5");
		}	
		
		System.out.println(4);
		System.out.println(5);

	}

}
