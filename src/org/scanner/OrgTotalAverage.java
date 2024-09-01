package org.scanner;

import java.util.Scanner;

public class OrgTotalAverage {
	
	public static void main(String[] args) {
		
		Scanner w=new Scanner(System.in);
		
		System.out.println("studentId");
		int i = w.nextInt();
		System.out.println(i);
		
		System.out.println("studentName");
		String p=w.next();
		System.out.println(p);
		
		System.out.println("Mark1");
		int k = w.nextInt();
		System.out.println(k);
		
		System.out.println("Mark2");
		int a = w.nextInt();
		System.out.println(a);
		
		System.out.println("Mark3");
		int b = w.nextInt();
		System.out.println(b);
		
		System.out.println("Mark4");
		int c = w.nextInt();
		System.out.println(c);
		
		System.out.println("Mark5");
		int g = w.nextInt();
		System.out.println(g);
		
		int sum =k+a+b+c+g;
		System.out.println("total mark"+sum);
		
		double avg=sum/5.0;
		System.out.println("average mark "+avg);
		w.close();
		
		
	}
	

}
