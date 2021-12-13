package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class DiviDeStringIntoNPart {

	//https://www.javatpoint.com/java-program-to-divide-a-string-in-n-equal-parts
	@Test
	public void Substring() {
		
	String str="aaabbbccc";
	            
	            
	int iParts=3;
	int iStringLen=str.length();
	
	String sTemp="";
	int sPartSize=iStringLen/iParts;
	
	for(int i=0;i<iStringLen;i=i+sPartSize) {	
		sTemp=sTemp+str.substring(i,i+sPartSize)+" ";
	}
	
   System.out.println(sTemp);
		
		
	}


@Test
public void NParts() {
	
	String str="aaaabbbbcccc";
    
    
	int iParts=3;
	int iStringLen=str.length();
	
	String sTemp="";
	int sPartSize=iStringLen/iParts;
	
	
	for(int i=0;i<iStringLen;i=i+sPartSize) {
		sTemp=sTemp+str.substring(i,i+sPartSize)+" ";
	}
	
	
	System.out.println(sTemp);
	
}
	
	
}
