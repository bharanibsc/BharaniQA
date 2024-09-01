package org.phonemethodoverloading;

public class Phone {
	
	private void phoneInfo() {
		System.out.println("android");
	}
	private void phoneInfo(int a,long b,short g){
		System.out.println("android:"+a);
		System.out.println("android:"+b);
		System.out.println("android:"+g);
	}
	private void phoneInfo(short ave ,long salary,double roll) {
		System.out.println("android:"+ave);
		System.out.println("android:"+salary);
		System.out.println("android:"+roll);
	}
	private void phoneInfo(long salary ,int roll ,double average ) {
		System.out.println("android:"+average);
		System.out.println("android:"+salary);
		System.out.println("android:"+roll);
	}
	private void phoneInfo(int v,long g,byte b){
		System.out.println("android:"+v);
		System.out.println("android:"+b);
		System.out.println("android:"+g);
	}
	public static void main(String[] args) {
		Phone gg=new Phone();
		gg.phoneInfo();
		gg.phoneInfo(5,6,85);
	    gg.phoneInfo(56, 4567, 5.6);
	    gg.phoneInfo(5566, 678, 5.67);
		gg.phoneInfo(56, 678, 7.87);
	}

}
