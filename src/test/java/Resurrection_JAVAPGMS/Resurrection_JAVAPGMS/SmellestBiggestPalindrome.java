package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class SmellestBiggestPalindrome {

	
	@Test
	public void demo() {
		
		 String string = "Wow you own kayak aaroraa";
		 String smallest="";
		 String biggest="";
		 
		 
		 for(String s:string.split(" ")) {
			 String rev="";
			 for(int i=s.length()-1;i>=0;i--)
				 {rev=rev+s.charAt(i);}
			 if(s.equals(s)) {	 
				 if(s.length()>biggest.length()) {
					 biggest=s;
				 }
				 if(smallest.length()==0) smallest=s;
				 if(s.length()<smallest.length()) smallest=s;
			 }
			 
		 }
		 
		System.out.println(smallest+"===>"+biggest);
		
	}
	
	@Test
	public void demo2() {
		
		
		
	}
}
