package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.Arrays;

import org.testng.annotations.Test;

public class CamelCaseConversion {
//http://makeseleniumeasy.com/2018/12/06/frequently-asked-java-program-25-java-program-to-convert-a-string-sentence-in-camel-case/
//Example: MakeSeleniumEasy  expect
	//input make selenium easy
	
	
	
	
	
	@Test
	public void Demo() {
		
		String str="input make selenium easy";
		
		String[] astr=str.split("\\s");		
		for(int i=0;i<astr.length;i++) {
			
			if(Character.isLowerCase(astr[i].charAt(0))) {				
				astr[i]=Character.toUpperCase(astr[i].charAt(0))+astr[i].substring(1);
			}			
		}
		
	System.out.println(String.join(" ", astr));//Input Make Selenium Easy
		
		
	}
	
}
