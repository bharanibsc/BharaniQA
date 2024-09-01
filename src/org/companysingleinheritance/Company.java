package org.companysingleinheritance;
//child class
public class Company extends Client

{
	
	private void companyName() {
		System.out.println("NCR");

	}
public static void main(String[] args) {
	Company g=new Company();
	g.companyName();
	g.clientName();
}
}
