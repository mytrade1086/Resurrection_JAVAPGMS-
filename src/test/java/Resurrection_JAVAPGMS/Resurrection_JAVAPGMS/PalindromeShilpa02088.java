package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class PalindromeShilpa02088 {

	
	@org.testng.annotations.Test
	public void Test() {
		
		System.out.println(palindrome("sumit"));
		System.out.println(palindrome("arora"));
		
	}
	
	
	public static boolean palindrome(String str) {
		
		//int j;
		for(int i=0,j=str.length()-1; i<j;++i,--j){
			
			if(str.charAt(i)!=str.charAt(j)) {
				
				return false;
			}
			
		}
		
		return true;
		
		
	}
	
}
