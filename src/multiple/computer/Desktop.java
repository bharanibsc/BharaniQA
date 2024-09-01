package multiple.computer;
//child class
public class Desktop implements HardWare,Software{

	public void desktopModel() {
		System.out.println("ASUS");

	}

	@Override
	public void hardwareResources() {
		System.out.println("hp");	
	}
	@Override
	public void softwareResources() {
		System.out.println("lenovo");
		
	}
	public static void main(String[] args) {
		Desktop k= new Desktop();
		k.desktopModel();
		k.hardwareResources();
		k.softwareResources();
	}
}
              //Multipleinheritance 