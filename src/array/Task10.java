package array;
import java.util.ArrayList;
import java.util.List;

public class Task10 {
	public static void main(String[] args) {
		//Create a new ArrayListlists with values and return the common values
		List<Integer> y=new ArrayList<Integer>();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(90);
		y.add(10);
		y.add(10);
		y.add(40);
		y.add(50);
		System.out.println(y);
		
		List<Integer>  j=new ArrayList<Integer>();
		j.add(30);
		j.add(40);
		j.add(50);
		j.add(60);
		j.add(80);
		System.out.println(j);
		
		j.retainAll(y);
		System.out.println("common values "+j);	
		
		//Create a new ArrayListlists with values and return the common values
		List<Integer> u=new ArrayList<Integer>();
		u.add(10);
		u.add(20);
		u.add(30);
		u.add(90);
		u.add(10);
		u.add(10);
		u.add(40);
		u.add(50);
		System.out.println(u);
		
		List<Integer> p=new ArrayList<Integer>();
		p.add(10);
		p.add(20);
		p.add(60);
		p.add(50);
		p.add(40);
		p.add(70);
		p.add(80);
		p.add(90);
		System.out.println(p);
		
		p.retainAll(u);
		System.out.println("common values "+p);
		
		//Create a new ArrayListlists with values and return the common values
		List<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		System.out.println(a);
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		l.add(800);
		System.out.println(l);
		
		l.retainAll(a);
		System.out.println("common values "+l);
		
		
		
		
	}

}
