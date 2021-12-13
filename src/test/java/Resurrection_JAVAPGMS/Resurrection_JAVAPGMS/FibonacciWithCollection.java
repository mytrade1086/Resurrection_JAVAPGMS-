package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class FibonacciWithCollection {

	@Test
	public void Test() {
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(0);
	al.add(1);
	
	//0 1 1 2 3 5 
	
	for(int i =3;i<=10;i++) {
		
		al.add(al.get(i-2) +al.get(i-3));
		
	}
		
	
	System.out.println(al);
	}
}
