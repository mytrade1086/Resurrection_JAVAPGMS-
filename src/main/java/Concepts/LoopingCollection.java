package Concepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopingCollection {

	public static void main(String[] args) {

		Set<String> hs = new HashSet();

		for (int i = 0; i < 4; i++) {

			hs.add(i + "item");
		}

		for (String s : hs) {
			System.out.println("Printing set=>" + s);
		}

		hs.forEach(s -> System.out.println("with labmda" + s));

		Iterator<String> is = hs.iterator();

		while (is.hasNext()) {
			System.out.println("using itwerstr" + is.next());
		}
		
			
		Map<String,String> hm=new LinkedHashMap<>();
		for (int i = 0; i < 4; i++) {
			hm.put(i+"key", i+"value");
		}
		
		
		hm.forEach((k,v)->System.out.println("key=>"+k+" value=>"+v));
		
		for(Entry<String, String>  es:hm.entrySet()) {
			System.out.println(" Looping entry set==>"+es.getKey()+ " "+es.getValue());
		}
		

	}
}
