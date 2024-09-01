package array;
import java.util.ArrayList;
import java.util.List;
public class Task8 {
	public static void main(String[] args) {
		//Add a value 50 in the 2nd index and display the list after adding.
		List<Integer> m=new ArrayList<Integer>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(90);
		m.add(10);
		m.add(10);
		m.add(40);
		m.add(50);
		
		m.add(2, 50);
		System.out.println(m);
		
		//Add a value 70 at the end of the list
		List<Integer> i=new ArrayList<Integer>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(90);
		i.add(10);
		i.add(10);
		i.add(40);
		i.add(50);
		
		i.add(8, 70);
		System.out.println(i);
		
		// Add a value 80 at the 8th index of list	
		List<Integer> p=new ArrayList<Integer>();
		p.add(10);
		p.add(20);
		p.add(30);
		p.add(90);
		p.add(10);
		p.add(10);
		p.add(40);
		p.add(50);
		
		p.add(8, 80);
		System.out.println(p);
		
		//Add a value 100 at the last index of 10 in the list
		List<Integer> o=new ArrayList<Integer>();
		o.add(10);
		o.add(20);
		o.add(30);
		o.add(90);
		o.add(10);
		o.add(10);
		o.add(40);
		o.add(50);
		
		o.add(5, 100);
		System.out.println(o);
	}

}
