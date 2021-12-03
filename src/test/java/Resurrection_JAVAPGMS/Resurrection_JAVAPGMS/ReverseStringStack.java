package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.Stack;

import org.testng.annotations.Test;

public class ReverseStringStack {
//Last In First Out (LIFO)”. The organised structure of plate is called a Stack.
	// http://makeseleniumeasy.com/2019/07/30/frequently-asked-java-programs-35-java-program-to-reverse-a-string-using-stack/
	@Test
	public void Reverse() {

		String s1 = "makeseleniumeasy";
		char[] ach = s1.toCharArray();
		// Creating an empty Stack
		Stack<Character> charConatiner = new Stack<Character>();

		for (char ch : ach) {

			charConatiner.push(ch);
		}

		for(int i=0;i<ach.length;i++) {
			
			ach[i]=charConatiner.pop();
		}
		
		System.out.println(s1);
		System.out.println(new String(ach));
//		makeseleniumeasy
//		ysaemuinelesekam
		}
}
