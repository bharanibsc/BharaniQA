package org.network;

public class Wifi {
	
	private void wifiName() {
		System.out.println("Railwaynet");

	}
	
	public static void main(String[] args) {
		Wifi m=new Wifi();
		m.wifiName();
		
		MobileData k=new MobileData();
		k.dataName();
		
		Lan l=new Lan();
		l.lanName();
		
		Wireless f=new Wireless();
		f.modamName();
	}

}
