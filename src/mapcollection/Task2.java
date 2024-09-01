package mapcollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {
		//Create a HashMap with the below key and values and get(print) the key only in the map.
		Map<Integer,String>  l=new HashMap<>();
		l.put(10, "Java");
		l.put(20, "sql");
		l.put(30, "oops");
		l.put(40, "Sql");
		l.put(50, "oracle");
		l.put(60, "DB");
		l.put(10, "Selenium");
		l.put(50, "psql");
		l.put(40, "Hadoop");
		
		Set<Integer> c = l.keySet();
		System.out.println(c);
		
		// Create a LinkedHashMap with the below key and values and get(print) the key only in the map.
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
		
		Set<Integer> g = k.keySet();
		System.out.println(g);
		
		//Create a TreeMap with the below key and values and get(print) the key only in the map.
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
		
		Set<String> u = a.keySet();
		System.out.println(u);
		
		//Create a HashTable with the below key and values and get(print) the key only in the map.
		Map<String ,String> s=new Hashtable<>();
		s.put("Vel", "Selenium");
		s.put("Ganesh", "Framework");
		s.put("Dinesh", "oracle");
		s.put("Vangat", "Corejava");
		s.put("Subash", "jira");
		
		Set<String> h = s.keySet();
		System.out.println(h);
		
		
		
		
	}

}
