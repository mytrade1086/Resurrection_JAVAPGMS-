package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class NumberPalindrome {

	
	@Test
	public void Reverse() {
		
		int num=2343;
		
		int rev=0;
		int rem=0;
		while(num>0) {
			rem=rem*10+num%10;
			num=num/10;
		}
		
		System.out.println(rem);
	}



@Test
public void prac() {
	
	int num=2343;
	int rev=0;
	while(num>0) {
		rev=rev*10+num%10;
	}
	

	
	
}
}

