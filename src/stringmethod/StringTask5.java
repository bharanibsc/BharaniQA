package stringmethod;

public class StringTask5 {

	public static void main(String[] args) {
		
		//Get the email id from the user and verify '@' is present or not?
		        
		String r="velmurugank451@gmail.com";
		boolean H = r.contains("@");
		System.out.println(H);
		
		//Get the address from the user and verify "pincode" is present or not?
		
		String n="5-35-2a,venkatesh nivas,Aruppukottai";
		 boolean K = n.contains("pincode");
		 System.out.println(K);
		 
		 //Get the email from the user and verify '@' is present or not and return true or false?
		 
		 String g="Nishakerala24@gmail.com";
		 boolean J = g.contains("@");
		 System.out.println(J);
		 
		 //Get the phonenumber from the user and verify any character is present or not .
		 String i="90954a6o78";
		 boolean w = i.contains("sfsfsfsadffs");
		 System.out.println(w);
		 
		 
		 
	}
}
