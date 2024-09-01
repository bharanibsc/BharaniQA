package stringmethod;

public class Stringtask9 {
	
	public static void main(String[] args) {
		
		//Given String as "Welcome to java class" and verify whether the given string startsWith welcome
		
		        String h="Welcome to java class";
				boolean J = h.startsWith("Welcome");
				System.out.println(J);
				
		//Given String as "Hai i am nisha" and verify whether the given string startsWith welcome
		
				String i="Hai i am nisha";
				boolean u = i.startsWith("welcome");
				System.out.println(u);
				
		// Given String as "Welcome to java class" and verify whether the given string endsWith class

				String w="Welcome to java class";
			boolean n = w.endsWith("class");
				System.out.println(n);
				
		// Given String as "Welcome to java class" and verify whether the given string endsWith java
				
				String b="Welcome to java class";
				boolean g = b.endsWith("java");
				System.out.println(g);

		//Given String as "Welcome to java class" and verify whether the string is empty or not
				
				String q="Welcome to java class";
				boolean e = q.isEmpty();
				System.out.println(e);
				
		//Given String as "" and verify whether the string is empty or not

				String a="";
			    boolean f = a.isEmpty();
				System.out.println(f);
				
				

		
	}
	
}
