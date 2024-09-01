package org.scanner;

import java.util.Scanner;

public class OrgScannerStudent {
	
	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		Scanner e=new Scanner (System.in);
		
		System.out.println("StudentId");
		int i = r.nextInt();
		System.out.println(i);
		
		System.out.println("StudentName");  
		String o=e.nextLine();
		System.out.println(o);
	
		System.out.println("StudentEmail");
		String p=r.next();
		System.out.println(p);
		
		System.out.println("StudentPhoneno");
		long t = r.nextLong();
		System.out.println(t);
		
		System.out.println("StudentDept");
		String j=r.next();
		System.out.println(j);
		
		System.out.println("StudentGender");
		String k=r.next();
		System.out.println(k);
		
		System.out.println("StudentCity");
		String h=r.next();
		System.out.println(h);
		r.close();
		e.close();
		
		
	}

}
