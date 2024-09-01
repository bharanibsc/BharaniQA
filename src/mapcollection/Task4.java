package mapcollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {

	public static void main(String[] args) {
         //Create a HashMap with the below key and values and iterate it using enhanced for loop.
		Map<Integer,String> m=new HashMap<>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "hadoop");
		System.out.println(m);
		for (String d: args) {
        System.out.println(d);			
		}

		//Create a LinkedHashMap with the below key and values and iterate it using enhanced for loop.
		Map<Integer,Integer>  k=new LinkedHashMap<>();
		k.put(10, 10);
		k.put(20, 20);
		k.put(30, 30);
		k.put(40, 40);
		k.put(50, 50);
		k.put(60, 60);
		k.put(10, 10);
		k.put(50, 50);
		k.put(40, 40);		
		System.out.println(k);
		for (String y : args) {
			System.out.println(y);		
		}
		//Create a TreeHashMap with the below key and values and iterate it using enhanced for loop.
		Map<String,Integer>  a=new TreeMap<>();
		a.put("!", 10);
		a.put("@", 20);
		a.put("#", 30);
		a.put("$", 40);
		a.put("%",50);
		a.put("^",60);
		a.put("&", 10);
		a.put("*", 50);
		a.put("(", 40);
		System.out.println(a);
		
		for (String r : args) {
			System.out.println(r);			
		}
		
		//Create a HashTable with the below key and values and iterate it using enhanced for loop.
		Map<String ,String> s=new Hashtable<>();
		s.put("Vel", "Selenium");
		s.put("Ganesh", "Framework");
		s.put("Dinesh", "oracle");
		s.put("Vangat", "Corejava");
		s.put("Subash", "jira");
		System.out.println(s);
		for (String f : args) {
			System.out.println(f);
			
		}
		
	}

}
