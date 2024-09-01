package complieploymorphism;

public class ComplieDemo1 {
	
	public static void main(String[] args) {
		ComplieDemo1 g=new ComplieDemo1();
		g.add(5, 9);
		g.add(4, 6, 7);
		g.add(67.5,56.8);
		g.add(6, 7.8);
		g.add(78.8, 89);
	}
	
	private void add(int a,int b) {//number of arguments
		int c=a+b;
		System.out.println("sum of num :"+c);
	}
	private void add(int a,int b,int c) {
		int f=a+b+c;
		System.out.println("sum of num :"+f);
	}
	
	private void add(double a,double b) {//type of arguments
		double c=a+b;
		System.out.println("sum of num :"+c);
	}
	
	private void add(int a,double b) {//order of arguments
		double c=a+b;
		System.out.println("sum of num :"+c);
	}
	private void add(double a,int b) {
		double c=a+b;
		System.out.println("sum of num :"+c);
	}
	

}
