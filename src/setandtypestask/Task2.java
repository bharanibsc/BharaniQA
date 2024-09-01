package setandtypestask;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Task2 {
	public static void main(String[] args) {
		//Convert the below list in to set(use addAll()) method	
	   Set<Integer> h=new LinkedHashSet<Integer>();
	   h.add(10);
	   h.add(20);
	   h.add(30);
	   h.add(90);
	   h.add(10);
	   h.add(10);
	   h.add(40);
	   h.add(50);   
	   System.out.println(h);
	   
	   List<Integer> j=new ArrayList<Integer>();
	   j.add(10);
	   j.add(20);
	   j.add(30);
	   j.add(90);
	   j.add(10);
	   j.add(10);
	   j.add(40);
	   j.add(50); 
	   System.out.println(j);
	   
	   h.addAll(j);
	   System.out.println(h);
	   
	   //Convert the below list in to set(use addAll()) method
	   Set<Integer> r=new LinkedHashSet<Integer>();
	   r.add(105);
	   r.add(205);
	   r.add(305);
	   r.add(405);
	   r.add(505);
	   r.add(605);
	   r.add(705);
	   r.add(805);
	   r.add(505);
	   r.add(605);	   
	   System.out.println(r);
	   
	   List<Integer> m=new ArrayList<Integer>();
	   m.add(105);
	   m.add(205);
	   m.add(305);
	   m.add(405);
	   m.add(505);
	   m.add(605);
	   m.add(705);
	   m.add(805);
	   m.add(505);
	   m.add(605);	   
	   System.out.println(m);
	   
	   r.addAll(m);
	   System.out.println(r);
	   
	   // Convert the below list in to set(use addAll()) method
	   Set<Integer> e=new LinkedHashSet<Integer>();
	   e.add(100);
	   e.add(200);
	   e.add(300);
	   e.add(400);
	   e.add(500);
	   e.add(600);
	   e.add(700);
	   e.add(100);
	   e.add(300);
	   e.add(500);	   
	   System.out.println(e);
	   
	   List<Integer> a=new ArrayList<Integer>();
	   a.add(100);
	   a.add(200);
	   a.add(300);
	   a.add(400);
	   a.add(500);
	   a.add(600);
	   a.add(700);
	   a.add(100);
	   a.add(300);
	   a.add(500);	   
	   System.out.println(a);
	   
	   e.addAll(a);
	   System.out.println(e);
	   
	   
	}

}
