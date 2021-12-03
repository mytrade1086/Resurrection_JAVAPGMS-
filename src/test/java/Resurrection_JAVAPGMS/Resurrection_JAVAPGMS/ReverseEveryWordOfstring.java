package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class ReverseEveryWordOfstring {
//http://makeseleniumeasy.com/2018/08/15/frequently-asked-java-program-18-java-program-to-reverse-every-word-of-a-string/
	
//	Original string                      :Make Selenium Easy
//	String with reversed words  :ekaM muineleS ysaE
	
	
	@org.testng.annotations.Test
	public void Test() {
		
		String str1="Make Selenium Easy";
		String rev="";
		
		String[] astr1=str1.split(" ");
		
		for(int i=0;i<astr1.length;i++) {
			
			String temp="";
			int j=0;
			for(j=astr1[i].length()-1;j>=0;j--) {
				temp=temp+astr1[i].charAt(j);
				
			}
			
			rev=rev+temp+" ";
			
			
			
			
			
			
		}
		
		System.out.println(rev.trim());
		
	}
}
