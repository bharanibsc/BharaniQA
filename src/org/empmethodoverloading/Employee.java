package org.empmethodoverloading;
//datatype arguments
public class Employee {
	
	private void empId() {
		System.out.println(45637);
	}
	private void empId(String name) {
		System.out.println("empId name:"+name );
	}
	private void empId(int age) {
		System.out.println("empId age:"+age);
	}
	private void empId(char num) {
		System.out.println("empId num:"+num);
	}
	private void empId(float order) {
		System.out.println("empId num:"+order);
	}
	private void empId(double pinNum) {
		System.out.println("empId num:"+pinNum);
	}
	private void empId(boolean rollNum) {
		System.out.println("empId num:"+rollNum);
	}
    public static void main(String[] args) {
		Employee t=new Employee();
		t.empId();
		t.empId("bharani");
		t.empId(30);
		t.empId('M');
		t.empId(67.7f);
		t.empId(876.9);
		t.empId(true);
    }
}