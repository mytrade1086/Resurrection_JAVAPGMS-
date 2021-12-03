package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class SwapIntegersWithoutthird {

	@Test
	public void Swap() {
		
		int ifirst=11;
		int iSecond=34;
		
		System.out.println("Before Swap: First=>"+ifirst +" Second =>"+iSecond);
		ifirst=ifirst+iSecond;
		iSecond=ifirst-iSecond;
		ifirst=ifirst-iSecond;
		
		
		System.out.println("After Swap: First=>"+ifirst +" Second =>"+iSecond);
	}
}
