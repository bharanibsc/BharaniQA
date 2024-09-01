package setandtypestask;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task5 {
     public static void main(String[] args) {
		//Create a new HashSet with values and perform removeAll() function
    	 HashSet<Integer> n=new HashSet<Integer>();
    	 n.add(10);
    	 n.add(20);
    	 n.add(30);
    	 n.add(90);
    	 n.add(10);
    	 n.add(10);
    	 n.add(40);
    	 n.add(50);
    	 System.out.println(n);
    	 
    	 HashSet<Integer> f=new HashSet<Integer>();
    	 f.add(30);
    	 f.add(40);
    	 f.add(50);
    	 f.add(60);
    	 f.add(80);
    	 System.out.println(f);
    	 n.removeAll(f);
    	 System.out.println(n);
    	 
    	 //Create a new LinkedHashSet with values and perform removeAll() function
    	 LinkedHashSet<Integer> m=new LinkedHashSet<Integer>();
    	 m.add(10);
    	 m.add(20);
    	 m.add(30);
    	 m.add(90);
    	 m.add(10);
    	 m.add(10);
    	 m.add(40);
    	 m.add(50);
    	 System.out.println(m);
    	 
    	 LinkedHashSet<Integer> k=new LinkedHashSet<Integer>();
    	 k.add(10);
    	 k.add(20);
    	 k.add(60);
    	 k.add(50);
    	 k.add(40);
    	 k.add(70);
    	 k.add(80);
    	 k.add(90);
    	 System.out.println(k);
    	 m.removeAll(k);
    	 System.out.println(m);
    	 
    	 //Create a new TreeSet with values and perform removeAll() function
    	 TreeSet<Integer> o=new TreeSet<Integer>();
    	 o.add(10);
    	 o.add(20);
    	 o.add(30);
    	 o.add(40);
    	 o.add(50);
    	 o.add(60);
    	 o.add(70);
    	 o.add(80);
    	 System.out.println(o);
    	 TreeSet<Integer> p=new TreeSet<Integer>();
    	 p.add(100);
    	 p.add(200);
    	 p.add(300);
    	 p.add(400);
    	 p.add(500);
    	 p.add(600);
    	 p.add(700);
    	 p.add(8000);
    	 System.out.println(p);
    	 
    	 o.removeAll(p);
    	 System.out.println(o);
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
