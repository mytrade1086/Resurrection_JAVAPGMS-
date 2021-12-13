package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class AllSubsetsofString {

	
	@Test
	public void demo() {
//		All the possible subsets for a string will be n(n+1)/2.
//		For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
		 String str = "FUN";  
	        int len = str.length();  
	        int temp = 0;  
	        //Total possible subsets for string of size n is n*(n+1)/2  
	        String arr[] = new String[len*(len+1)/2];  
		
	        
	        for(int i=0;i<str.length();i++) {
	        	for(int j=i;j<str.length();j++) {
	        		System.out.println(str.substring(i,j+1));
	        		
//	        		F
//	        		FU
//	        		FUN
//	        		U
//	        		UN
//	        		N
	        	}
	        	
	        }
	}
}
