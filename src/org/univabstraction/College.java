package org.univabstraction;
//child class
public class College extends University {

	@Override
	void ug() {
		System.out.println("Srm university");
	}
	@Override
	void pg() {
	System.out.println("madars univeristy");	
	}
	public static void main(String[] args) {
		College k=new College();
		k.ug();
		k.pg();
		k.mba();
	}
	
}
