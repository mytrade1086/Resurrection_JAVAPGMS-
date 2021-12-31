package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class FirstNonRepeatingCharinString {

	
	@Test
	public void demo() {
		
		
		String str="eeThis is the real deal";
		
		int len=str.length();
		
		
		for(int i=0;i<str.length();i++) {
			
			int temLen=str.replaceAll(String.valueOf(str.charAt(i)), "").length();
			if(len-temLen==1) {	
				System.out.println(str.charAt(i));
				break;
			}
			
		}
		
		
	}
}
