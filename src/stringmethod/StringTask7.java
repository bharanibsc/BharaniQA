package stringmethod;

public class StringTask7 {

	public static void main(String[] args) {
		
		//Given string as "Welcome to java class" and replace java into sql
		
		String h="Welcome to class java";
		String b = h.replace("java", "sql");
		System.out.println(b);
		
		//Given string as "Greens Adayar"and replace Adayar into Omr
		
		String y="Greens Adayar";
		String t = y.replace("Adayar", "omr");
		System.out.println(t);
		
		//Given String as "Welcome to java class" and Replace space into '#'
		
		String g="Welcome to java class";
		String n = g.replace(' ', '#');
		System.out.println(n);
		
		//Get the email from the user and verify "gmail" is present or not.
        //If present replace that gmail into yahoo
		//Input  = Nishakerala24@gmail.com
		//Output = Nishakerala24@yahoo.com 

		String l="Nishakerala24@gmail.com";
		String c = l.replace("gmail", "yahoo");
		System.out.println(c);
		
		//Get the address from the user and verify "pincode" is present or not.
        //If present replce the pincode with empty space
		
		//Input  = 5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101
		//Output = 5-35-2a,venkatesh nivas,Aruppukottai 
		
		String p="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
		String d = p.replace("pincode", " ");
		System.out.println(d);

	}

}
