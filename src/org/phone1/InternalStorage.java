package org.phone1;

public class InternalStorage {
	
	private void processorName() {
		System.out.println("Anroied");

	}
	
	private void ramSize() {
		System.out.println("64gb");

	}
	
	public static void main(String[] args) {
	 InternalStorage k=new InternalStorage();
	 k.processorName();
	 k.ramSize();
	 
	 ExternalStorage m=new ExternalStorage();
	 m.size();
	}

}
