package ArrayPgms;

import java.util.Arrays;

public class ReverseArray {

	
	
	public static void main(String[] args) {
		
		int [] arr= { 0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(arr));
		int i=arr.length-1,j=0;

		while(i>=j) {
			int temp=0;
			temp=arr[i];  //9
			arr[i]=arr[j]; //9 =>0
			arr[j]=temp;   //0=>9
			
			i--;j++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
