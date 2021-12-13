package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class ReverseStringWithRecursion {

	
	
	@Test
	public void Recursion () {
		
		Reverse("sumit raut");
		
		
	}
	
	
	public static void Reverse(String str) {		
	if(str.length()<1) {
		
		System.out.println(str);
	}
	
	else {
		
		
		System.out.print(str.charAt(str.length()-1));
		System.err.println(str.substring(0,str.length()-1));
		Reverse(str.substring(0,str.length()-1));
	}
}
}
