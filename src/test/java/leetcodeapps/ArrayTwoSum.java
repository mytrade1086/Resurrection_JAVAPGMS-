package leetcodeapps;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ArrayTwoSum {

	
	@Test
	public void twosumbruteforce() {
		
		//int [] arr= {2,7,5,9,5,4};
		int [] arr= {0,1,2,3,4,5,6,7,8,9};
		int target=9;
		
		for(int j=0;j<arr.length-1;j++) {
			
			int x=target-arr[j];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]==x) {
				
				System.out.println(arr[j]+" "+arr[i]);
			}
		}
		}
		
		
	}
	
	@Test
	public void Hashmap() {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int [] arr= {0,1,2,3,4,5,6,7,8,9};
		int target=9;
		
		
		for(int i=0;i<arr.length;i++) {
			
		    int x=target-arr[i];
			if(hm.containsKey(x)){
				System.out.println("********"+hm.get(x)+" "+i);
			}
			
			hm.put(arr[i], i);
			
			
		}
		
		
	}
}
