package org.indiamultilevel;

import org.andrapradeshmultilevel.AndhraPradesh;

//child class
public class India extends AndhraPradesh
{
	private void india() {
		System.out.println("Tamilnadu");
	}	
	public static void main(String[] args) {
		India g=new India();
		g.india();
		g.tamillanguage();
		g.telugu();
		g.malayalam();
	
	}
}
