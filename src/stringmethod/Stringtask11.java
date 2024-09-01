package stringmethod;

public class Stringtask11 {
	
	public static void main(String[] args) {
		
		//Generate the two non literal string and find the identityHashCose()
		
		String s1="Nisha";
		String s2="Nisha";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		//Generate the two non literal string and find the identityHashCose()
		
		String d1=new String ("Nisha");
		String d2=new String ("Nisha");
		
		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		
		//Generate the three non literal string and find the identityHashCose()

		String e1=new String("Nisha");
		String e2=new String("Rengan");
		String e3=new String("NishaRengan");
		
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e3));
		
		//Generate the three literal string and find the identityHashCose()
		
		String v="Nisha";
		String v2="Rengan";
		String v3="NishaRengan";
		
		System.out.println(System.identityHashCode(v));
		System.out.println(System.identityHashCode(v2));
		System.out.println(System.identityHashCode(v3));
		
		
	}

}
