package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;
import  org.testng.annotations.Test;
public class StringAnagram2 {

	
	
	@Test
	public void Test() {
	
		
		String s1="Grab";
	    String s2="bragd";
	    
	    
	    
	    for(char c:s1.toLowerCase().toCharArray()) {
	    	
	    	
	    	if(s2.toLowerCase().indexOf(c)<0) {
	    		
	    		System.out.println("String are not anagram");
	    	}
	    	
	    	else {
	    		s2=s2.replace(c,' ');
	    	}
	    }
	    
	    
	    if(s2.trim().length()>0) {
	    	
	    	System.out.println("String are not anagram");
	    }
	    
	    else {
	    	
	    	System.out.println("String are anagram");
	    }
		
		
		
	}
}
