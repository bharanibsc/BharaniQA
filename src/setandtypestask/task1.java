package setandtypestask;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class task1 {
	public static void main(String[] args) {
		//Create a HashSet for the below values	
		Set<Integer> u=new HashSet<Integer>();
		u.add(10);
		u.add(20);
		u.add(30);
		u.add(40);
		u.add(50);
		u.add(60);
		u.add(70);
		u.add(80);
		u.add(90);
		u.add(10);
		u.add(20);	
		System.out.println(u);	
		//Create a LinkedHashSet for the below values
		Set<Integer> y=new LinkedHashSet();
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
		System.out.println(y);
		 //Create a TreeSet for the below values
		Set<Integer> p=new TreeSet<Integer>();
		p.add(10);
		p.add(20);
		p.add(30);
		p.add(40);
		p.add(50);
		p.add(60);
		p.add(70);
		p.add(80);
		p.add(90);
		p.add(10);
		p.add(20);
     	System.out.println(p);
		
		
		
		
	
	}

}
