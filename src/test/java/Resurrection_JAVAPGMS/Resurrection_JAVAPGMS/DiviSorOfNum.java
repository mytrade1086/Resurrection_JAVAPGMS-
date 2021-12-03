package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class DiviSorOfNum {

	
	@Test
	public void test() {
		
		int num=10;
		
		String divisors="";
		for(int i=num;i>=1;i--) {
			
			if(num%i==0) {
				
				divisors=divisors+ i+" ";
				
			}
			
		}
		
		System.out.println(divisors);
		
		
	}
}
