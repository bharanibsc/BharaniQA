package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	
	private void TransportForm() {
		System.out.println("Filled");

	}
	
	public static void main(String[] args) {
		Transport k=new Transport();
		k.TransportForm();
		
		Road y=new Road();
		y.bike();
		y.bus();
		y.cycle();
		y.car();
		
		Air w=new Air();
		w.aeroPlane();
		w.heliCopter();
		
		Water h=new Water();
		h.boat();
		h.ship();
	}

}
