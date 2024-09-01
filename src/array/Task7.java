package array;

import java.util.ArrayList;
import java.util.List;
public class Task7 {
	public static void main(String[] args) {
		//Remove the value present at 2nd index
		List<Integer> u=new ArrayList<Integer>();
		u.add(10);
		u.add(20);
		u.add(30);
		u.add(40);
		u.add(50);
		u.add(60);
		
		u.remove(2);
		System.out.println(u);
		
		//Remove the value present at 10th index 
		/*List<Integer> y=new ArrayList<Integer>();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(90);
		y.add(10);
		y.add(10);
		y.add(40);
		
		y.remove(10);
		System.out.println(y);*/   //No 10th index value in this program
		
		//Remove the last value of 10 present in the list  
		List<Integer> y=new ArrayList<Integer>();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(90);
		y.add(10);
		y.add(10);
		y.add(40);
		
		y.remove(5);
		System.out.println(y);
		
	}

}
