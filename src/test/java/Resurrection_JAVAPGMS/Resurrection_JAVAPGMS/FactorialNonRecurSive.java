package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class FactorialNonRecurSive {

	//@Test
	public void Test() {
		
		int num=5;
		
		int fact=1;
				
			while(num>=1) {
					
					fact=fact*num;
					num--;
				};
				System.out.println("factorial is ==>"+fact);
	}
	
	
	@Test
	public void Test2() {
		
		int num=5;
		int fact=1;
		
		System.out.println(fact(5));
				
			
	}
	
	
	public static int fact(int m) {
		if(m==0)return 1;
		else
		{	
			return m*fact(m-1);
		}
			}
}
