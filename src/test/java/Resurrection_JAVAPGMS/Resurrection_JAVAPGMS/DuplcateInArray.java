package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplcateInArray {

	
	//@Test
	public void duplcate() {
		
	
		String [] aStr= {"java","java","javascipt","c","c++","java","c"};
		Set<String> st=new HashSet<String>();
		
		String duplcates="";
		for(String s:aStr) {
			
			
		if(!st.add(s))
			duplcates=duplcates+s+" ";		
		}
		System.out.println(duplcates);
		
	}
	
	
	
	@Test
	public void dupl() {
		String [] aStr= {"java","java","javascipt","c","c++","java","c"};
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String s:aStr) {
		
			if(hm.containsKey(s)){
				hm.put(s,hm.get(s)+1);
			}
			else {
				
				hm.put(s,1);
			}
		}
		
hm.forEach((k,v)->{ 
	if(v>1) {System.out.println(k+"==>"+v);}});
		
		
		
		
	}
}
