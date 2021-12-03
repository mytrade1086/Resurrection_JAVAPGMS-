package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;
//http://makeseleniumeasy.com/2019/02/12/frequently-asked-java-program-30-java-program-to-find-distinct-characters-in-given-string/

//User input: Make Selenium Easy
//
//Output: K L N I U Y

public class DistinctcharsInString {

	@org.testng.annotations.Test
	public void Test() {

		String str = "Make Selenium Easy".toLowerCase().trim().replace(" ", "");
		char[] ach = str.toCharArray();
		String nonRepeating="";
		int i=0;
		while(i<str.length()) {
		int index=str.indexOf(ach[i]);				
		index=str.indexOf(ach[i],index+1)	;
		
		if(index<0) {
			nonRepeating=nonRepeating+String.valueOf(ach[i]);			
		}
	
		i++;
		}
		System.out.println("Non Repeating==>" + nonRepeating);
	}
	
//	@org.testng.annotations.Test
//	public void Temp() {
//		String str = "Make Selenium Easy".toLowerCase().trim().replace(" ", "");
//		char[] ach = str.toCharArray();
//		String nonRepeating="";	
//		
//		
//		for(int i=0;i<str.length();i++) {
//			
//			while(str.indexOf(ch)) {
//				
//				
//				
//			}
//			
//			
//		}
//		
//		
//	}
}
