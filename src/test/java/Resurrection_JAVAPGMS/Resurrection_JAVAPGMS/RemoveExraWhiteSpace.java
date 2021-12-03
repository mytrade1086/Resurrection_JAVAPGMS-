package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class RemoveExraWhiteSpace {

	//http://makeseleniumeasy.com/2018/10/28/frequently-asked-java-program-23-java-program-to-remove-extra-whitespace-between-words-in-given-string/
	
//	You entered with spaces: ”       Make       Selenium         Easy       ”
//	String after removing extra white space: “Make Selenium Easy”
	@Test
	
	public void RemoveSpace() {
		
		String str="       Make       Selenium         Easy       ";
		System.out.println(str);
		str=str.trim().replace("  ", "");
		System.out.println(str);
//
//	       Make       Selenium         Easy       
//	       Make Selenium Easy
		
	}
	
	@Test
	public void Alternateapproach() {
		
		
		
		
	}
}
