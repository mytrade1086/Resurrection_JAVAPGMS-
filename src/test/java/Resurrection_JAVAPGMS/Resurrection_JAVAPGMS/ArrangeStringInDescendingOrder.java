package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.Arrays;

import org.apache.commons.io.input.TaggedInputStream;

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
}
