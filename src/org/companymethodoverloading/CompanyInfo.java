package org.companymethodoverloading;

public class CompanyInfo {
	private void companyName() {
		System.out.println("ncr");
	}
	private void companyName(int a,int b) {
		System.out.println("ncr:"+a);
		System.out.println("ncr:"+b);
	}
	private void companyName(double average,long salary) {
		System.out.println("ncr:"+average);
		System.out.println("ncr:"+salary);
	}
	private void companyName(String name,int pin  ) {
		System.out.println("ncr"+name);
		System.out.println("ncr"+pin);
	}
	private void companyName(char Gender,boolean t) {
		System.out.println("ncr:"+Gender);
		System.out.println("ncr:"+t);
	}
	public static void main(String[] args) {
		CompanyInfo b=new CompanyInfo();
		b.companyName();
		b.companyName(56.5,75645);
		b.companyName(6,7);
		b.companyName("bharani",9);
		b.companyName('h',true);
	}
}
