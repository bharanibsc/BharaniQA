package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
		System.out.println("Samsung");
	}
	private void phoneMieiNum() {
	System.out.println("739e9eyie8ye");
	}
	private void Camera() {
		System.out.println("24pixel");
       }
	private void storage() {
		System.out.println("64gb");
	}
	private void osName() {
		System.out.println("andriod");
	}
public static void main(String[] args) {
	PhoneInfo m=new PhoneInfo();
	m.phoneName();
	m.phoneMieiNum();
	m.Camera();
	m.storage();
	m.osName();
}
	
}
