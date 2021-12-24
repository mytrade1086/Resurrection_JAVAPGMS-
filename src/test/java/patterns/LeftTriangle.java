package patterns;

import org.testng.annotations.Test;

public class LeftTriangle {

	@Test
	public void LeftTriangle() {
		
		
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				
				if(j<i) {System.out.print(" ");}
				if(j>=i){ System.out.print("*"+" ");}
				
		}
			System.out.println();
		}
/*
 * 
 
        *
      * *
    * * *
  * * * *
* * * * *

*/
		
		
	}
}
