package org.allmultilevel;

import org.telgumutilevel.Telgu;

//child class
public class Languageclass extends Telgu{
	
	private void alllanguage() {
		System.out.println("Allsubject");

	}
	
	public static void main(String[] args) {
		Languageclass f=new Languageclass();
		f.alllanguage();
		f.tamillanguage();
		f.englishlanguage();
		f.telgulanguage();
	}

}
