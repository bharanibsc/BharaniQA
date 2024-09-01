package methodoverrdingdemo1;

public class ChildClass extends Parent{
	
	@Override
	public void display() {
		System.out.println("i am using iphone display");	
	}
	public void display(int a ,int b) {
		int i=a+b;
		System.out.println("i am using iphone display:"+i);	
	}
	
	
	
	public static void main(String[] args) {
		ChildClass obj1=new ChildClass();
		obj1.display();
		obj1.show();
		obj1.display(56, 87);
		
		Parent u=new Parent();
		u.display();
		u.show();
		
		Parent h=new ChildClass();
		h.display();
		
		//ChildClass k=new Parent();
		//cannot convert child to parent mainmethod
	
	}

}
