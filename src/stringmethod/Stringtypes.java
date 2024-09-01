package stringmethod;

public class Stringtypes {
	
	public static void main(String[] args) {
		
		System.out.println("liternal string ");
		
		  String s1="welcome";
		  String s2="selenium";
		  String s3 ="welcome";
		  
		  System.out.println(System.identityHashCode(s1));
		  System.out.println(System.identityHashCode(s2));
		  System.out.println(System.identityHashCode(s3));
		  
		  System.out.println(" Non liternal string ");
		  String s4= new String("computer");
		  String s5 =new String ("computer");
		  
		  System.out.println(System.identityHashCode(s4));
		  System.out.println(System.identityHashCode(s5));
		  
		  
		  
		  
		  
		  
	}

}
