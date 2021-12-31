package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class ArrayMissingNumber {

	
	@org.testng.annotations.Test
	public void Test() {
		int[] first = { 1, 2, 3, 4,5,6,7};	
		
		int sum=0;
		
		for(int i=0;i<first.length;i++) {
			sum=sum+first[i];
		}
	}
		
		
		
		@org.testng.annotations.Test
		public void Prac() {
			int[] first = { 1, 2,4,5,6,7};	
			
			int expectedSum=0;
			
			for(int i=first[0];i<=first[first.length-1];i++) {
				expectedSum=expectedSum+i;
			}
			
			
			int actualSum=0;	
			for(int i=0;i<first.length;i++) {
				actualSum=actualSum+first[i];	
			}
			
			
			System.out.println("Missing Num=>"+(expectedSum-actualSum));//Missing Num=>3
			
		}
		
		
		
		
		
	}

