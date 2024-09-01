package org.scanner;

import java.util.Scanner;

public class OrgScannerEmp {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter your empid");
		int i= s.nextInt();
		System.out.println(i);
		
		System.out.println("empName");
		String n=s.next();
        System.out.println(n);
        
        System.out.println("empEmail");
        String E=s.next();
        System.out.println(E);
        
        System.out.println("empPhoneno");
        long p = s.nextLong();
		System.out.println(p);
		
		System.out.println("empSalary");
		double S = s.nextLong();
		System.out.println(S);
		
		System.out.println("empGender");
		char G= s.next().charAt(0);
		System.out.println(G);
		
		System.out.println("empCity");
		String C=r.nextLine();
		System.out.println(C);
		s.close();
		r.close();
	}

}
