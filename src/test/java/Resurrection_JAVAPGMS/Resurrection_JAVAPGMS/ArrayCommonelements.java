package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ArrayCommonelements {
//https://www.geeksforgeeks.org/java-program-to-find-common-elements-between-two-arrays/
	
	
	//Input:  Array1 = ["Article", "for", "Geeks", "for", "Geeks"], 
	  //      Array2 = ["Article", "Geeks", "Geeks"]
	@Test
	public void test() {
	
		String [] str1= {"Article", "for", "Geeks", "for", "Geeks"};
		String [] str2= {"Article", "Geeks", "Geeks"};
		
		HashMap<String,Integer> st=new HashMap<String,Integer>();
		for(String s: str2) {			
			st.put(s, st.getOrDefault(s, 0)+1);
		}
		
		
		for(String s: str1) {			
			if(st.containsKey(s)) {
				
				System.out.println("Duplite Keys==>"+s);
//				Duplite Keys==>Article
//						Duplite Keys==>Geeks
//						Duplite Keys==>Geeks
				
			}
		}
		
		
		
		
		
		
	}
}
