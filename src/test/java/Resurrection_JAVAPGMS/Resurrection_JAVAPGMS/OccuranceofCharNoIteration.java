package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

//http://makeseleniumeasy.com/2018/12/25/frequently-asked-java-program-27-java-program-to-find-occurrence-of-any-char-in-a-given-string-without-iterating/

//Input – Make Selenium Easy
//
//Char – ‘M’
//
//Output- Occurrence of M is 2.
public class OccuranceofCharNoIteration {

	
	@org.testng.annotations.Test
	public void Test() {
		
		String str=" Make Selenium Easy".toLowerCase();
		
		String sReplc="M";
		
		int iLenght=str.length();
		str=str.replace("M".toLowerCase(), "");
		System.out.println(iLenght-str.length());
		
		
	}
}
