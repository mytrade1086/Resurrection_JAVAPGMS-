package ArrayPgms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SecondinAray {

	
	
	
	

	@Test
	public void demo() {
		
		int [] arr= {2,4,1,9,10,45};
		
		int max=arr[0];
		int max2=arr[1];
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max2=max;
				max=arr[i];
			}		
			else {
				max2=arr[i];	
			}
		}
		System.out.println(max+"==>"+max2);	
	}
	
	
@Test
public void prac() {
	int [] arr= {12,23,34,11,33};
	int max=arr[0];
	int max2=arr[1];	
	for(int i=0;i<arr.length;i++) {	
		
	if(arr[i]>max) {
	max2=max;
	max=arr[i];
	}
		else {	
			max2=arr[i];
		}
	}

	}
	
	
	
}




