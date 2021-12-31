package patterns;

import org.testng.annotations.Test;

public class IncreasingPattern {

	
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			
			
			for(int j=1;j<=i;j++) {
				
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}



//* 
//* * 
//* * * 
//* * * * 
//* * * * * 


@Test

public void demo() {
	
	
	String str="If you love it like I love it\r\n" + 
			"And you feel what I feel inside\r\n" + 
			"If you want it like I want it\r\n" + 
			"Then baby let's get it tonight";
	
	
	for(int i=1;i<=n;i++) {
		
		
		for(int j=1;j<=i;j++) {
			
			
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
}

}