package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class PrintWordCircularOrder {

//	“Make Selenium Easy” Where
//
//	-“Make” is at position zero.
//	-“Selenium” is at first position .
//	-“Easy” is at second position .
//
//	If I say:
//
//	-zero, You need to print “Make Selenium Easy”.
//	-one, you need to print “Selenium Easy Make”.
//	-two, you need to print “Easy Selenium Make”
	
	@Test
	public void Demo() {
	
		String str="Make Selenium Easy";
		String[]aStr=str.split(" ");
		int iLength=aStr.length;
		int start=2;
		String newString="";
	  for(int i=start;i<iLength;i++) {
		  
		  newString=newString+aStr[i]+" ";
	  }
	  
	  for(int j=0;j<start;j++) {
		  
		  newString=newString+aStr[j]+" ";
	  }
	  
	  System.out.println(newString);
	}
	
	
}

