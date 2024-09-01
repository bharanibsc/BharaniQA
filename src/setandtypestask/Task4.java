package setandtypestask;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task4 {
	public static void main(String[] args) {
		//Create a new HashSet with values and return the common values
		HashSet<Integer> n=new  HashSet<Integer>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(90);
		n.add(10);
		n.add(10);
		n.add(40);
		n.add(50);
		System.out.println(n);
		
		HashSet<Integer> i=new  HashSet<Integer>();
		i.add(30);
		i.add(40);
		i.add(50);
		i.add(60);
		i.add(80);
		System.out.println(i);
		i.retainAll(n);
		System.out.println("Common values "+i);
		
		// Create a new LinkedHashSet with values and return the common values
		LinkedHashSet<Integer> v=new LinkedHashSet<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(90);
		v.add(10);
		v.add(10);
		v.add(40);
		v.add(50);
		System.out.println(v);
		LinkedHashSet<Integer> c=new LinkedHashSet<Integer>();
		c.add(10);
		c.add(20);
		c.add(60);
		c.add(50);
		c.add(40);
		c.add(70);
		c.add(80);
		c.add(90);
		System.out.println(c);
		c.retainAll(v);
		System.out.println("common values"+c);
		
		//  Create a new TreeSet with values and return the common values
		TreeSet<Integer> b=new TreeSet<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
        System.out.println(b);
		TreeSet<Integer> j=new TreeSet<Integer>();
		j.add(100);
		j.add(200);
		j.add(300);
		j.add(400);
		j.add(500);
		j.add(600);
		j.add(700);
		j.add(8000);
		System.out.println(j);
		j.retainAll(b);
		System.out.println("common values "+j);
		
		
		
		
		
			
	}

}
