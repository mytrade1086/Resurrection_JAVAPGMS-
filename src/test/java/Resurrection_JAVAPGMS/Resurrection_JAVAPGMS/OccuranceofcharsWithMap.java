package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class OccuranceofcharsWithMap {

	
	@Test
	public void Test() {
	
		
		String str="Sumit Raut";
		
		String[] aStr=str.split("");
		
		Map<String,Integer>  map=new HashMap<String,Integer>();
		
		for(int i=0;i<aStr.length;i++) {
			
			if(map.containsKey(aStr[i])){
				
				Integer count=map.get(aStr[i]);
				
				map.put(aStr[i], ++count);
				
			}	
			else {
				
				
				map.put(aStr[i], 1);
			}
			
		}
		
		System.out.println(map);//{ =1, a=1, R=1, S=1, t=2, u=2, i=1, m=1}
		
		System.err.println("-------------------------");
		
		map.forEach((k,v)->System.out.println(k+"==>"+v));
		
		
	}
}
