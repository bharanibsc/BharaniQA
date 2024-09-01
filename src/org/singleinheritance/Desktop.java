package org.singleinheritance;
//childclass
public class Desktop extends Computer
{
	
	private void desktopSize()
	{
		System.out.println("45inch");
      }
	public static void main(String[] args) {
		Desktop r=new Desktop();
		r.desktopSize();	
		r.computerModel();
		
	}

}
