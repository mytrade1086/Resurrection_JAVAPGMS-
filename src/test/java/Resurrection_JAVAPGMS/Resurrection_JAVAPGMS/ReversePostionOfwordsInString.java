package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReversePostionOfwordsInString {
//http://makeseleniumeasy.com/2018/08/17/frequently-asked-java-program-19-java-program-to-reverse-position-of-words-in-a-string/
	
//	Input String: You are awesome
//	Output String: awesome are You
//	
	
	
	@Test
	public void test() {
		
		String str1=" You are awesome";
		
		String[] stra=str1.split(" ");
		String rev="";
		for(int i=stra.length-1;i>0;i--) {
			
			rev=rev+stra[i]+" ";
		}
		
		System.out.println(rev.trim());
	}
}
