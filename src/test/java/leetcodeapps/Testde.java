package leetcodeapps;

import org.testng.annotations.Test;

public class Testde {

	
	@Test
	public void test() {
		
		
		
	String s="GOOD";
	int counter=0;
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)=='O') {
			counter++;
		}
		if(counter==2) {
			
			System.out.println(i);
			break;
		}
		
	}
	
	
	
	String str="sumitt";
	
	
	System.out.println('c'-'a');
	
	int [] charcount=new int[26];
	
	for(char c:str.toCharArray()) {
		
		charcount[c-'a']++;
	}
		
	
	System.out.println();
	}
}
