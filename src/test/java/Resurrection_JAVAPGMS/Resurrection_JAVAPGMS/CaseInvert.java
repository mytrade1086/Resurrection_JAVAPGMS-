package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.Arrays;

import org.testng.annotations.Test;

public class CaseInvert {

	//http://makeseleniumeasy.com/2019/10/14/frequently-asked-java-program-36-java-program-to-invert-case-of-each-char-in-a-string/
	
//	Input: – mAkE SeleNIUM eaSY
//
//	Output:-MaKe sELEnium EAsy
	
	@Test
	public void InvertCase() {
		
		String s1="mAkE SeleNIUM eaSY";
		char[] s1char=s1.toCharArray();
		
		for(int i=0;i<s1char.length;i++) {
			
			if(Character.isUpperCase(s1char[i]))
				{s1char[i]=Character.toLowerCase(s1char[i]);
				}
			
			
			else  if(Character.isLowerCase(s1char[i]))
				{s1char[i]=Character.toUpperCase(s1char[i]);
				}
				}
		
		System.out.println(s1);
		s1=new String(s1char);
		
//		System.out.println(s1);
//		mAkE SeleNIUM eaSY
//		MaKe sELEnium EAsy
		}
	

		
		
	
}
