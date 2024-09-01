package setandtypestask;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Task3 {
	public static void main(String[] args) {
		//Get the each value of set by using enhanced  for loop	
		Set<Integer> h=new LinkedHashSet<Integer>();
		h.add(105);
		h.add(205);
		h.add(305);
		h.add(405);
		h.add(505);
		h.add(605);
		h.add(705);
		h.add(805);
		System.out.println("set by using enhanced for loop");
		for (Integer x : h) {
	         System.out.println(x);		
		}		
		//Create a TreeSet and iterate each value in the set by using enhanced for loop
		Set<Integer> y=new TreeSet<Integer>();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(40);
		y.add(50);
		y.add(60);
		y.add(70);
		y.add(80);
		y.add(90);
		y.add(10);
		y.add(20);
		System.out.println("Treeset and iterate using enhanced for loop");
		for (Integer f : y) {
               System.out.println(f);			
		}		
		//Create a HashSet and iterate each value in the set by using enhanced for loop
		Set<Integer> q= new HashSet<Integer>(); 
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(10);
		q.add(20);
		System.out.println("hashset and iterate using enhanced for loop");
		for (Integer r : q) {
			System.out.println(r);
		}
		
		
		
		
	}

}
