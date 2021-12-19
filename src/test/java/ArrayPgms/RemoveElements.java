package ArrayPgms;

public class RemoveElements {

	/*
	 * Remove element and Return Length
	 *  arr[3,2,2,3] val 3    expected length=2 since we would remove 3
	 */
	
	public static void main(String[] args) {
		int[] arr= {3,2,2,3,3};
		
		int val=2;
		int j=0;
		for(int i=0;i<arr.length;i++) {
			
			if(val!=arr[i]) {
				int temp=arr[i];	
				arr[j]=temp;
				j++;
			}
		}
		
		System.out.println(j);
		
	}
}


