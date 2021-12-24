package patterns;

import org.testng.annotations.Test;

public class Pattern1 {

	/*
	 * 

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
	 */
	@Test
	public void pattern1() {
		
		for(int i=1;i<=5;i++) {
			
			
			
			for(int j=1;j<=i;j++) {
				
				
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}
		
		
	}
}
