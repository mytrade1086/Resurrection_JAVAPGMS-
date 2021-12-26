package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.io.input.TaggedInputStream;
import org.testng.annotations.Test;

public class ArrangeStringInDescendingOrder {

	
	public static void main(String[] args) {
		
		
		String  testv="This is a new day";
		String [] test="This is a new day".split(" ");
		
		
		for(int i=0;i<test.length-1;i++) {
			for (int j=i+1;j<test.length;j++) {
			
				if(test[i].length()<test[j].length()) {
					String temp=test[i];
					test[i]=test[j];
					test[j]=temp;
					
				}
				
			}
		}
		
		System.out.println(Arrays.toString(test));//[This, new, day, is, a]
		
		
	}
	
	
	
	@Test
	public void Method2() {
		
		String  testv="This is a new day";
		String [] test="This is a new day".split(" ");
		
		
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>();
		for(String s: test) {
		ts.put(s.length(), s);
		}
			
		ts.forEach((k,v)->System.out.println(k+" "+v));
		
		
		
	}
}
