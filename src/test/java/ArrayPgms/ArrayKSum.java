package ArrayPgms;

import java.util.Arrays;
import java.util.Collections;

public class ArrayKSum {

	
	
	public static void main(String[] args) {
		
		//https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/?ref=lbp
		
		 Integer a[] = {2, 1, 3};
		    int b[] = {7, 8, 9};
		    int k = 10;
		    int n = a.length;
		
		  // Sort the array a[] in decreasing order.
	    Arrays.sort(a, Collections.reverseOrder());
	 
	    // Sort the array b[] in increasing order.
	    Arrays.sort(b);
	 
	    // Checking condition on each index.
	    for (int i = 0; i < n; i++)
	    if (a[i] + b[i] < k) {
	    }
	    else {	
	    	System.out.println(a[i]+" "+b[i]);
	    }
	       
	    
	    
	}
}
