package ArrayPgms;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		
		int num=13;
		int count=0;
		
		boolean bPrime=false;
		for(int i=num;i>=2;i--) {
			
			
			if(num%i==0) {
				count++;
			}
			
			
			if(count>1) {
				
				System.out.println();
				
			}
			
			
		}
		
	}
}
