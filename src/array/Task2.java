package array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class Task2 {
	public static void main(String[] args) {
		//Create a new ArrayListlist with values and find the length of it	
		ArrayList<Integer> a=new ArrayList<Integer>();
         a.add(10);
         a.add(20);
         a.add(30);
         a.add(90);
         a.add(10);
         a.add(10);
         a.add(40);
         a.add(50);       
         int x = a.size();
         System.out.println(x); 
         
         // Create a new LinkedListlist with values and find the length of it
         LinkedList<Integer> b=new LinkedList<Integer>();
         b.add(100);
         b.add(200);
         b.add(300);
         b.add(400);
         b.add(500);
         b.add(600);
         b.add(700);     
         int c = b.size();
         System.out.println(c);      
         
         
         //Create a new vector with values and find the length of it  
         Vector<Integer> m=new Vector<Integer>();
         m.add(105);
         m.add(205);
         m.add(305);
         m.add(405);
         m.add(505);
         m.add(605);
         m.add(705);
         m.add(805);
         int d = m.size();
         System.out.println(d);        
         //Create a new LinkedListlist with values and find the size() of it
         LinkedList<Integer> s=new LinkedList<Integer>();
         s.add(100);
         s.add(200);
         s.add(300);
         s.add(400);
         s.add(500);
         s.add(600);
         s.add(700);
         int l = s.size();
         System.out.println(l);
		
	}

}
