package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	
	private void VehicleNecessery() {
		System.out.println("yes ");

	}
	public static void main(String[] args) {
		Vehicle u=new Vehicle();
		u.VehicleNecessery();
		
		TwoWheller i=new TwoWheller();
		i.bike();
		i.cycle();
		
		ThreeWheeler p=new ThreeWheeler();
		p.Auto();
		
		FourWheeler m=new FourWheeler();
		m.car();
		m.bus();
		m.lorry();
	}
	

}
