package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class Add9Till99 {

	
	@Test
	public void Test() {
		
		int iTotal=0;
		for(int i=1;i<100;i++) {
			int iOriginalcount=String.valueOf(i).length();
			int iChanged=String.valueOf(i).replaceAll("9","").length();
			
			if(iOriginalcount-iChanged>0) {
				iTotal=iTotal+9*(iOriginalcount-iChanged);
				System.out.println("Number Considered==>"+i);
			}	
		}	
		System.out.println(iTotal);
		
		
	}
}
