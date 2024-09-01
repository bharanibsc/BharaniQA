package stringmethod;

public class Stringtak2 {
	
	public static void main(String[] args) {
		
		//Find the particular character index  in the given string task
		
		        //0123456789012345
		String q="GreensTechnology ";
		int k = q.lastIndexOf("o");
		System.out.println(k);
		
		        //0123456789012345678901
		String n="SeleniumAutomationtool";
		int m = n.indexOf("o");
		System.out.println(m);
		
		        //0123456789
		String l="Velmurugan ";
		int d = l.indexOf("n");
		System.out.println(d);
		
		        //0123456789012345678901  //find out last emptyspace
		String R="j a v a p r o g r a m ";
		int g= R.lastIndexOf(" ");
		System.out.println(g);
		
		        //0123456789
		String e="9095484678 ";
		int F = e.indexOf("8");
		System.out.println(F);
		
		
		
	}

}
