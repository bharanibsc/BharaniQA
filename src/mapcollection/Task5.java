package mapcollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task5 {
      public static void main(String[] args) {
    //Create a HashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination.
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
    	  
  		Set<Entry<Integer, String>> y = m.entrySet();
  		for (Entry<Integer, String> x : y) {
  			System.out.println("key:"+x.getKey());
  			System.out.println("Values:"+x.getValue());		
		}
  		//Create a LinkedHashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination.
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
		
		Set<Entry<Integer, Integer>> t= k.entrySet();
		for (Entry<Integer, Integer> f : t) {
			System.out.println("key:"+f.getKey());
		    System.out.println("Values:"+f.getValue());	
		}
		
		//Create a TreeHashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination.
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
		
		Set<Entry<String, Integer>> u = a.entrySet();
		for (Entry<String, Integer> s : u) {
			System.out.println("key:"+s.getKey());
			System.out.println("Values:"+s.getValue());	
		}
		//Create a HashTable with the below key and values and iterate it using enhanced for loop and get the key and values combination.
		Map<String ,String> s=new Hashtable<>();
		s.put("Vel", "Selenium");
		s.put("Ganesh", "Framework");
		s.put("Dinesh", "oracle");
		s.put("Vangat", "Corejava");
		s.put("Subash", "jira");
		
		Set<Entry<String, String>> h = s.entrySet();
		for (Entry<String, String> r : h) {
			System.out.println("key:"+r.getKey());
			System.out.println("Values:"+r.getValue());		
		}	
	}
}
