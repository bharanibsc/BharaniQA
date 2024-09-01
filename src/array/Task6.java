package array;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
	public static void main(String[] args) {
		//Get the value present at 2nd index
		List<Integer>  h=new ArrayList<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
		Integer d = h.get(2);
		System.out.println(d);
		
		//Get the value present at 4th index
		List<Integer>  g=new ArrayList<Integer>();
		g.add(100);
		g.add(200);
		g.add(300);
		g.add(400);
		g.add(500);
		g.add(600);
		g.add(700);
		Integer  j= g.get(4);
		System.out.println(j);
		
		//Get the value present at 8th index
		/*List<Integer> t=new ArrayList<Integer>();
		t.add(105);
		t.add(205);
		t.add(305);
		t.add(405);
		t.add(505);
		t.add(605);
		t.add(705);
		t.add(805);
		Integer r= t.get(8);
		System.out.println(r);*/  //No value of 8th Index 
		
		// Get the each value of list by using normal for loop
		List<Integer> t=new ArrayList<Integer>();
		t.add(105);
		t.add(205);
		t.add(305);
		t.add(405);
		t.add(505);
		t.add(605);
		t.add(705);
		t.add(805);
		System.out.println("Normal for Loop");
		for (int i = 0; i < t.size(); i++) {
			System.out.println(t.get(i));
		}
			
		//Get the each value of list by using enhanced for loop\
			List<Integer> r=new ArrayList<Integer>();
			r.add(105);
			r.add(205);
			r.add(305);
			r.add(405);
			r.add(505);
			r.add(605);
			r.add(705);
			r.add(805);
			System.out.println("Enhanced For loop");
			
			for (Integer e : r) {
				System.out.println(e);
				
			}
	}

}
