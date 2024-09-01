package org.hierarchicalinheritance3;

import org.hierarchicalinheritance.House;

//child 2
public class Broker extends House{

	private void nameBroker() {
		System.out.println("sasi");
	}
         public static void main(String[] args) {
			Broker y=new Broker();
			y.nameBroker();
			y.address();
		}
}
