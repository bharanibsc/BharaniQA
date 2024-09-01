package org.edumethodoverriding;
//childclass
public class Education extends Arts{

	@Override
	public void ug() {
		System.out.println("bsc");	
	}
	@Override
	public void pg() {
		System.out.println("MBA");
	}
	public static void main(String[] args) {
		Education n=new Education();
		n.bA();
		n.bBA();
		n.bEd();
		n.bSc();
		n.ug();
		n.pg();
	}
	
}
