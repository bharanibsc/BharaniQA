package org.addmethodoverloading;

public class GreensTech {
	
	private void greensOmr() {
		System.out.println("Anna nagar");
	}
	private void greensOmr(int order,String type ,float number) {
		System.out.println("Anna nagar:"+order);
		System.out.println("Anna nagar:"+type);
		System.out.println("Anna nagar:"+number);
	}
	private void greensOmr(String type ,int number,double order ) {
		System.out.println("Anna nagar:"+order);
		System.out.println("Anna nagar:"+type);
		System.out.println("Anna nagar:"+number);
	}
	private void greensOmr(long order ,char number ,String type) {
		System.out.println("Anna nagar:"+order);
		System.out.println("Anna nagar:"+type);
		System.out.println("Anna nagar:"+number);
	}
	public static void main(String[] args) {
		GreensTech h=new GreensTech();
		h.greensOmr();
		h.greensOmr(76, "sasi",98);
		h.greensOmr("lokesh", 765, 89.7);
		h.greensOmr(876, 'g', "sridhar");
		
	}
}
