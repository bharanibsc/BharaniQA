package org.edumultilevel;
//childclass
public class Education  extends Medicine
{
	private void ug() {
	System.out.println("Bsc");
	}
	private void pg() {
		System.out.println("MBA");
	}
	public static void main(String[] args) {
		Education t=new Education();
		t.pg();
		t.ug();
		t.bA();
		t.bBA();
		t.bEd();
		t.bsc();
		t.physiyo();
		t.dental();
		t.mbbs();
		t.bE();
		t.bTech();
		
	}

}
