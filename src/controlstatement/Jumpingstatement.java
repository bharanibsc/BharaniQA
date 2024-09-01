package controlstatement;

public class Jumpingstatement {
	
	public static void main(String[] args) {
		
		//break statement
		 for (int i = 1; i < 15; i++) {
			 if (i==7) {
				break;
			}
			System.out.println(i);
		}
		 //continue statement 
		 for (int i = 1; i < 15; i++) {
			 if (i==7 || i==10) {
				continue;
			}
			System.out.println(i);
		}
		 System.out.println("outside loop");
		//system.exit
		for (int i = 1; i < 15; i++) {
			 if (i==7 || i==10) {
		   System.exit(0);;
			}
			System.out.println(i);
		}
		 
	}

}
