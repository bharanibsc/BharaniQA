package controlstatement;

public class Switchcase {
	
	public static void main(String[] args) {
		//switchcase
		int days=3;
		switch (days) {
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
		
		case 4:
			System.out.println("Thusady");
			break;
		case 5:
			System.out.println("friday");
			break;

		default:
			System.out.println("saturday");
			break;
		}
	}

}
