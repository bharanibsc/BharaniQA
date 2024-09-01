package org.bikefullyabstract;
//child class
public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("90000");
		
	}

	@Override
	public void speed() {
		System.out.println("76587");

	}
	
	public static void main(String[] args) {
		Ktm m=new Ktm();
		m.cost();
		m.speed();
	}

}
