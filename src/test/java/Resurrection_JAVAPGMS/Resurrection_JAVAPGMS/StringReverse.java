package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class StringReverse {

	@Test
	public void Reverse() {
		
		
		String sStr1="This is sparta";
		
		System.out.println("original String=>"+sStr1);
		
		String sRev="";
		int iLen=sStr1.length();
	
		for(int i=iLen-1;i>=0;i--) {
			
			sRev=sRev+String.valueOf(sStr1.charAt(i));
			
		}
		
		System.out.println("Reversed String=>"+sRev);
		
	}
}
