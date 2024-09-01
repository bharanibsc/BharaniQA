package org.bankmethodoverriding;
//child class
public class AxisBank extends BankInfo
{
	@Override
	public void deposit() {
		System.out.println("depsoit 15%");
			}
	public static void main(String[] args) {
		AxisBank k=new AxisBank();
		k.deposit();
		k.saving();
		k.fixed();
	}
}
