package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("3748");
	}
	
	private void empName() {
		System.out.println("Bharani");
	}
	private void empDob() {
		System.out.println("11.08.1992");
	}
	private void empPhone() {
		System.out.println("8098466102");
	}
	private void empEmail() {
		System.out.println("Bharani@gmail.com");
	}
	private void empAddress() {
		System.out.println("chennai");
	}
    public static void main(String[] args) {
		Employee b=new Employee();
		b.empId();
		b.empName();
		b.empDob();
		b.empPhone();
		b.empEmail();
		b.empAddress();
		
		}
}
