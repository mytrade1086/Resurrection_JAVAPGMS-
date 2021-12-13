package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class CountVowelsConsonants {

	
	@Test
	
	public void Count() {
		
		
		 //Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String str = "This is a really simple sentence";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
        
        
       str=str.replaceAll(" ", "");
        vCount=str.length()-  str.replaceAll("[aeiou]", "").length();//15
        
        cCount=str.length()-  str.replaceAll("[^aeiou]", "").replace(" ","").length();//17
        
		
        System.out.println();
	}
	
}
