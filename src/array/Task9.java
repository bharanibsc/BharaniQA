package array;
import java.util.ArrayList;
import java.util.List;
public class Task9 {
	public static void main(String[] args) {	
		//Replace the value 300 into 350 in the list
		List<Integer> k=new ArrayList<Integer >();
		k.add(100);
		k.add(200);
		k.add(300);
		k.add(400);
		k.add(500);
		k.add(600);
		k.add(700);
		
		k.set(2, 350);
		System.out.println(k);		
		//Replace the value present in 7th index as 90 
		List<Integer> q=new ArrayList<Integer >();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(90);
		q.add(10);
		q.add(10);
		q.add(40);
		q.add(50);
		q.add(10);
		
		q.set(7,90);
		System.out.println(q);
		//Replace the 10 into 100 in List
		List<Integer> y=new ArrayList<Integer >();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(90);
		y.add(10);
		y.add(10);
		y.add(40);
		y.add(50);
		y.add(30);		
		y.set(0, 100);
		y.set(4, 100);
		y.set(5, 100);
		System.out.println(y);
		
		
	
	}

}
