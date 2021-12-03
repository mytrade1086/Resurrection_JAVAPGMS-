package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class SwapStrings {


	@Test
	public void SwapString() {
		
		String s1="Test";
		String s2="Prject";
		
		s1=s1+s2;
		
		s2=s1.substring(0,s1.indexOf(s2));
		
		s1=s1.split(s2)[1];
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	@Test
	public void SwapString2() {
		
		String s1="Test";
		String s2="Prject";
		
		s1=s1+s2;
		
		s2=s1.substring(0,s1.indexOf(s2));
		
		s1=s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	
}
