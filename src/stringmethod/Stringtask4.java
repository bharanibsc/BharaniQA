package stringmethod;

public class Stringtask4 {

	public static void main(String[] args) {
		
		//Description : Get two input from user and check the equality
	    //: print in the output whether it is Equal or not
		
		//equals 
	     String s1 = "Java";
		 String s2 = "Java";
		 
		boolean r = s1.equals(s2);
        System.out.println(r);
        
        String e1 = "Java";
        String e2 = "java";
        
        boolean d = e1.equals(e2);
        System.out.println(d);
        
        String q1 = "Green Technology";
        String q2 = "GreenTechnology.";
        boolean f = q1.equals(q2);
        System.out.println(f);
        
        //equalsIgnoreCase
        String a1 = "Java";
        String a2 = "java";
        boolean u = a1.equalsIgnoreCase(a2);
        System.out.println(u);
        
        String c1 = "Nisha";
        String c2 = "nisha";
        
        boolean k = c1.equalsIgnoreCase(c2);
        System.out.println(k);
       
	}
	
	
	
	
}
