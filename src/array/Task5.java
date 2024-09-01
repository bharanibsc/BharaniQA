package array;
import java.util.ArrayList;
import java.util.List;
public class Task5 {
	public static void main(String[] args) {
		
		//Get the first index value of 10 
		List<Integer> f=new ArrayList<Integer>();
		f.add(10);
	    f.add(20);
	    f.add(30);
	    f.add(90);
	    int r = f.indexOf(10);
	    System.out.println(r);
	    
	    //Get the last index value of 10 
	    List<Integer> y=new ArrayList<Integer>();
	    y.add(10);
	    y.add(20);
	    y.add(30);
	    y.add(90);
	    y.add(10);
	    y.add(10);
	    y.add(40);
	    y.add(50);
	    int q = y.lastIndexOf(10);
	    System.err.println(q);
	    
	   // Get the index value of 50 
	    List<Integer>  s=new ArrayList<Integer>();
	    s.add(10);
	    s.add(20);
	    s.add(30);
	    s.add(90);
	    s.add(10);
	    s.add(10);
	    s.add(40);
	    s.add(50);
	    int a = s.indexOf(50);
	    System.out.println(a);
	    
	    //Get the index value of 90 
	    List<Integer> n=new ArrayList<Integer>();
	    n.add(10);
	    n.add(20);
	    n.add(30);
	    n.add(90);
	    n.add(10);
	    n.add(10);
	    n.add(40);
	    n.add(50);
	    int t = n.indexOf(90);
        System.out.println(t);
        
        //Get the each index value of 10 present in below list 
        List<Integer> u = new ArrayList<Integer>();
        u.add(10);
        u.add(20);
        u.add(30);
        u.add(90);
        u.add(10);
        u.add(10);
        u.add(40);
        u.add(50);
        u.add(10);
       
        for (int i = 0; i < u.size(); i++) {
            if (u.get(i) == 10) {
                System.out.println("Index of 10: " + i);
            }}
        //Get the each index value of 70 present in below list 
        List<Integer> p = new ArrayList<Integer>();       
        p.add(10);
        p.add(20);
        p.add(30);
        p.add(90);
        p.add(10);
        p.add(10);
        p.add(40);
        p.add(50);
        p.add(10);
        for (int j = 0; j < p.size(); j++) {
        	if(p.get(j)==70) {
			System.out.println("Index of 70:"+j);
        	}      
	}
}}
