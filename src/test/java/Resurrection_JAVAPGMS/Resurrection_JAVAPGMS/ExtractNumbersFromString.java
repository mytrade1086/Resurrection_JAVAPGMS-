package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class ExtractNumbersFromString {

	
	
	
	@Test
	public void Demo() {
		
	String str="This is new123 and 45 plus 2";
	
	str=str.replaceAll(str.replaceAll("\\d+", ""),"");
	
	System.out.println(str);

		
		
	}
}
