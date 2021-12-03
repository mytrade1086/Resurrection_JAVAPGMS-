package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class OccuranceOfEachcharsWithoutIteration {

	//http://makeseleniumeasy.com/2018/12/24/frequently-asked-java-program-26-java-program-to-find-occurrence-of-each-char-in-a-given-string-without-using-collection/
	@org.testng.annotations.Test
	public void Test() {
	//Make Selenium Easy	
		
		String str="Make Selenium Easy".toUpperCase();
		
		
		while(str.length()>0) {
		String ch=	String.valueOf(str.charAt(0));
		
		int original=str.length();
		str=str.replace(ch, "");		
		int occur=original-str.length();
			System.out.println(ch+" occurs"+occur+" times");
		}
		
//		M occurs2 times
//		A occurs2 times
//		K occurs1 times
//		E occurs4 times
//		  occurs2 times
//		S occurs2 times
//		L occurs1 times
//		N occurs1 times
//		I occurs1 times
//		U occurs1 times
//		Y occurs1 times

		
	
}

}