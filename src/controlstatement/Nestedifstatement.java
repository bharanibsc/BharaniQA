package controlstatement;

public class Nestedifstatement {
	
	public static void main(String[] args) {
		//nestedif
		int empid =150;
		int deptid =200;
		
		if (empid >=130) {
			System.out.println("employe from tcs");
			
			if (deptid <=170) {
				System.out.println("empyolyee form tcs and testing");
				
			} else {
				System.out.println("empyolyee form tcs and other dept");
			}
			
		} else {
			System.out.println("employe from not tcs");

		}
		
	}

}
