package org.company;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("NCR");

	}
	private void companyId() {
		System.out.println("37387");
	}
	private void companyAddress() {
	System.out.println("Vellore");
	}
	public static void main(String[] args) {
		CompanyInfo r=new CompanyInfo();
	    r.companyName();
		r.companyId();
		r.companyAddress();
	}

}
