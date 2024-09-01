package stringmethod;

public class Stringstypes2 {
	public static void main(String[] args) {

		//Immutable String 
		  String s6="welcome";
		  String s7="selenium";
		  
		  System.out.println(System.identityHashCode(s6));
		  System.out.println(System.identityHashCode(s7));
		  
		  s6=s6.concat(s7);
		  System.out.println(s6);
		  System.out.println(System.identityHashCode(s6));
		  
		  //MuttableString 
		  
		  StringBuffer s4=new StringBuffer("COmputer");
		  StringBuffer s5=new StringBuffer("COmputer");
		  
		  System.out.println(System.identityHashCode(s4));
		  System.out.println(System.identityHashCode(s5));
		  
		  s4 = s4.append(s5);
		  System.out.println(s4);
		  System.out.println(System.identityHashCode(s4));
		  
		  
	}
	
	  

}
