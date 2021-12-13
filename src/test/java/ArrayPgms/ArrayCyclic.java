package ArrayPgms;

import java.util.Arrays;

public class ArrayCyclic {

//	Given array is 
//	1 2 3 4 5 
//	Rotated array is
//	5 1 2 3 4 
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		
		int i=0,j=arr.length-1;
		
		while(i!=j) {
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}


//{1, 2, 3, 4, 5};
//
//5 2 3 4 5 1
//5 1 3 4 5 2
//
//5 1 2 4 5 3
//
//5 1 2 3 5 4

