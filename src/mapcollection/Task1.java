package mapcollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		//Create a HashMap with the below key and values
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
		
		// Create a LinkedHashMap with the below key and values
		Map<Integer,Integer> o=new LinkedHashMap<>();
		o.put(10, 10);
		o.put(20, 20);
		o.put(30, 30);
		o.put(40, 40);
		o.put(50, 50);
		o.put(60, 60);
		o.put(10, 10);
		o.put(50, 50);
		o.put(40, 40);
		System.out.println(o);
		
		//Create a TreeHashMap with the below key and values
		Map<String,Integer> g=new TreeMap<>();
		g.put("!",10);
		g.put("@",20);
		g.put("#",30);
		g.put("$",40);
		g.put("%",50);
		g.put("^",60);
		g.put("&",10);
		g.put("*",50);
		g.put("(",40);
		System.out.println(g);
		
		//Create a HashTable with the below key and values
		Map<String,String> l=new Hashtable<>();
		l.put("Vel", "Selenium");
		l.put("Ganesh", "Framework");
		l.put("Dinesh", "oracle");
		l.put("Vangat", "Corejava");
		l.put("Subash", "jira");
	System.out.println(l);

	
	}

}
