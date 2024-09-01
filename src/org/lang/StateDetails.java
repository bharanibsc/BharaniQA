package org.lang;

public class StateDetails {
	
	private void southIndia() {
		System.out.println("Chennai");

	}
	private void northIndia() {
		System.out.println("Delhi");
	}
	
	public static void main(String[] args) {
		 StateDetails i =new StateDetails();
		i.southIndia();
		i.northIndia();
		
		LanguageInfo e=new LanguageInfo();
		e.tamilLanguage();
		e.englishLanguage();
		e.hindiLanguage();
	}

}
