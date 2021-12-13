package ArrayPgms;

public class ArrayRotation {
//https://www.geeksforgeeks.org/array-rotation/
	
	
	/*
	 * Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7 1) Store the first d
	 * elements in a temp array temp[] = [1, 2] 2) Shift rest of the arr[] arr[] =
	 * [3, 4, 5, 6, 7, 6, 7] 3) Store back the d elements arr[] = [3, 4, 5, 6, 7, 1,
	 * 2]
	 */
	
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int d = 2, n =7;
		int []temp=new int[d];
		for(int i=0;i<d;i++) {temp[i]=arr[i];}
		for(int i=2;i<n;i++) {	
			arr[i-2]=arr[i];	
		}
		
		for(int i=arr.length-1, j=temp.length-1;i>=arr.length-d;i--,j--) {
			
			arr[i]=temp[j];
			
		}
		
		
		
	}
			
}
