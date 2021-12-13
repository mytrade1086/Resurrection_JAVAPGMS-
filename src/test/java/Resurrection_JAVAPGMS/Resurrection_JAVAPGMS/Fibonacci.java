package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class Fibonacci {

	
	@Test
	public void demo() { 
		int iFirst=0;
		int iSecond=1;
		System.out.print(iFirst +" "+iSecond);
		for(int i=0;i<8;i++) {
			int c=iFirst+iSecond;
			System.out.print(" "+c);
			 iFirst=iSecond;
			 iSecond=c;
		}
		
		
	}
}
