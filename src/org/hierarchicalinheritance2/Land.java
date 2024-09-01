package org.hierarchicalinheritance2;

import org.hierarchicalinheritance.House;

//child 1
public class Land extends House
{
	private void nameOfLand() {
		System.out.println("Son");
	}
	public static void main(String[] args) {
		Land u=new Land();
		u.nameOfLand();
		u.address();
	}

}
