package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class ReverseCheckStringbuffer {

	// http://makeseleniumeasy.com/2017/06/01/java-program-to-check-if-any-string-is-palindrome-using-reverse-method/
	
	@Test
	public void  Test() {
	
		
		String sOrginal="arora";
		
		StringBuilder sb=new StringBuilder(sOrginal);
		StringBuilder sb2=new StringBuilder(sb.reverse());
		
		
		
		//Note. .Equal in StringBuffer is not overridden for Content Comparison
		if(sb.equals(sb2)) {
			System.out.println("String are equal");
		}
		
		else {
			System.out.println("String are not equal");
		}
		
		//String are not equal
		
		
		
		
		
		
		
		System.err.println("*************************************");
		
		if(String.valueOf(sb).equals(String.valueOf(sb2))) {
			System.out.println("String are equal");
		}
		
		else {
			System.out.println("String are not equal");
		}
		
		//String are equal
		
		
	}
}
