package ArrayPgms;

public class Segregate0and1 {

	
	public static void main(String[] args) {
		
//		Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
//				Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 
			
		
		int [] arr= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		
		int aLength=arr.length;
		int zero=0;
		
		for(int i=0;i<arr.length;i++) {if(arr[i]==0) zero++;}
		
		for(int i=0;i<arr.length;i++) {
			
			if(i<=zero-1) {
				
				arr[i]=0;
			}
			
			else {
				
				arr[i]=1;
			}
			
			
		}
		
		
		
		
		
	}
}
