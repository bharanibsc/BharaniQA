package mapcollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Task3 {
	public static void main(String[] args) {
		//Create a HashMap with the below key and values and get(print) the values only in the map.
		Map<Integer,String> p=new HashMap<>();
		p.put(10, "Java");
		p.put(20, "sql");
		p.put(30, "oops");
		p.put(40, "Sql");
		p.put(50, "oracle");
		p.put(60, "DB");
		p.put(10, "Selenium");
		p.put(50, "psql");
		p.put(40, "Hadoop");
		
		Collection<String> g = p.values();
		System.out.println(g);
		
		
		//Create a LinkedHashMap with the below key and values and get(print) the values only in the map.
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
		
		Collection<Integer> h = k.values();
		System.out.println(h);
		
		//Create a TreeHashMap with the below key and values and get(print) the values only in the map.
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
		
		Collection<Integer> f = a.values();
		System.out.println(f);
		
		//Create a HashTable with the below key and values and get(print) the key only in the map.
		Map<String ,String> s=new Hashtable<>();
		s.put("Vel", "Selenium");
		s.put("Ganesh", "Framework");
		s.put("Dinesh", "oracle");
		s.put("Vangat", "Corejava");
		s.put("Subash", "jira");
		
		Collection<String> b = s.values();
		System.out.println(b);
		
		
	}

}
