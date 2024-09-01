package org.banksingleinheritance;
//child class
public class BankInfo extends AxisBank 
{
	private void saving() {
		System.out.println("Name-Sasi");
	}
	private void fixed() {
		System.out.println("Desposit");
	}

	public static void main(String[] args) {
		BankInfo h=new BankInfo();
		h.saving();
		h.fixed();
		
		h.deposit();
		
	}
}
