package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class FloydTriangle {
//http://makeseleniumeasy.com/2017/06/20/java-program-06-print-a-floyd-triange-of-given-number-of-rows/
	
//	1
//	2	3
//	4	5	6
//	7	8	9	10
//	11	12	13	14	15
	@Test
	public void Demo() {
		int Row=5;
		int start=1;
		for(int r=1;r<=5;r++) {
			
			for(int j=1;j<=r;j++) {
				
				System.out.print(start+" ");
				start++;
			}
			System.out.println("");
			
		}
		
		
		
	}
}
