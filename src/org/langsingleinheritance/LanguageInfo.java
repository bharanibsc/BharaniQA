package org.langsingleinheritance;
//child class
public class LanguageInfo extends StateDetails
{
	private void tamilLanguage() {
		System.out.println("tamil");
	}
	private void englishLanguage() {
		System.out.println("english");
	}
	private void hindiLanguage() {
		System.out.println("hindi");
	}
	public static void main(String[] args) {
		LanguageInfo t=new LanguageInfo();
		t.tamilLanguage();
		t.englishLanguage();
		t.hindiLanguage();
		
		t.southIndia();
		t.northIndia();
		
	}
	

}
