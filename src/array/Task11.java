package array;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
	public static void main(String[] args) {
		// Create a new ArrayListlists with values and perform removeAll() function
		
		List<Integer> b=new ArrayList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(90);
		b.add(10);
		b.add(10);
		b.add(40);
		b.add(50);
		System.out.println(b);
		
		List<Integer> c=new ArrayList<Integer>();
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(80);
		System.out.println(c);
		
		b.removeAll(c);
		System.out.println(b);
		
		
		//Create a new ArrayListlists with values and perform removeAll() function
		List<Integer> f=new ArrayList<Integer>();
		f.add(10);
		f.add(20);
		f.add(30);
		f.add(90);
		f.add(10);
		f.add(10);
		f.add(40);
		f.add(50);
		System.out.println(f);
		
		List<Integer> e=new ArrayList<Integer>();
		e.add(10);
		e.add(20);
		e.add(60);
		e.add(50);
		e.add(40);
		e.add(70);
		e.add(80);
		e.add(90);
		System.out.println(e);
		
		f.removeAll(e);
		System.out.println(f);
		
		
		//Create a new ArrayListlists with values and perform removeAll() function
		List<Integer> q=new ArrayList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		System.out.println(q);
		
		List<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		a.add(8000);
		System.out.println(a);
		
		q.removeAll(a);
		System.out.println(q);
		
		
		
		
		
		
		
	}

}
