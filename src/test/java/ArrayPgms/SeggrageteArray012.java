package ArrayPgms;

public class SeggrageteArray012 {

	
	public static void main(String[] args) {
//		
//	Input :  {0, 1, 2, 0, 1, 2}
//	Output : {0, 0, 1, 1, 2, 2}
//
//	Input :  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
//	Output : {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
		
		
		
		int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		
		for(int i=0;i<arr.length;i++) {	
			if(arr[i]==0) {count0++;}
			if(arr[i]==1) {count1++;}
			if(arr[i]==2) {count2++;}
			
		}
		
		
		
		
	}
}
