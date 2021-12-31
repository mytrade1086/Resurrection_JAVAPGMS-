package Searches;

import org.testng.annotations.Test;

public class Binarysearch {

	
	//Binary search needs sorted array
	// li ia beginning index hi is last index   mid=li+hi/2
	// loop till li<=hi
	
	
	public static void main(String[] args) {
		
		int [] arr= {1,2,4,5,7,8,9};
		boolean bFound=false;
		int target=9;
		
		int li=0;
		int hi=arr.length-1;
		
		int mi=(li+hi)/2;
		
		
		while(li<=hi) {
			
		
			if(target==arr[mi]) 
				{
				System.out.println(mi+1);
				bFound=true;
				break;
				}
			
			else if(target>arr[mi]) {
				
				li=mi+1;
			}
			
			else if(target<arr[mi]) {
				hi=mi-1;
			}
			
			mi=(hi+li)/2;
		}
		
		if(!bFound) System.out.println("NOT FOUND");
	}
	
	
	
	
//	@Test
//	public void prac() {
//		
//		
//		ret("sumit");
//		
//	}
//	
//	
//	public static void ret(String s) {
//		
//		if(s.length()>0) {
//			System.out.print(s.substring(s.length()-1));
//			ret(s.substring(0,s.length()-1));
//		}
//		
//	}
	
	
	
	
}
