package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.lang.reflect.Array;

public class InvertCase {
	
	
	public static void main(String[] args) {
		//Input: – mAkE SeleNIUM eaSY
		//Output:-MaKe sELEnium EAsy
		//http://makeseleniumeasy.com/2019/10/14/frequently-asked-java-program-36-java-program-to-invert-case-of-each-char-in-a-string/	
		System.out.println(ReturnInverted("mAkE SeleNIUM eaSY"));//MaKe sELEnium EAsy
		System.out.println(ReturnInverted("MaKe sELEnium EAsy"));//mAkE SeleNIUM eaSY
		
		
		
	}
	
	
	
	
	public static String ReturnInverted(String sText) {		
		char[] achar=sText.toCharArray();		
		for(int i=0;i<achar.length;i++) {
			if(Character.isUpperCase(achar[i])) achar[i]=Character.toLowerCase(achar[i]);
			else if(Character.isLowerCase(achar[i])) achar[i]=Character.toUpperCase(achar[i]);
		}		
		return new String(achar);			
	}

}
