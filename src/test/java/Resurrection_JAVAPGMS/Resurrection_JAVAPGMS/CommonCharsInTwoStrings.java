package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class CommonCharsInTwoStrings {

	// http://makeseleniumeasy.com/2019/04/08/frequently-asked-java-programs-31-java-program-to-find-common-characters-in-two-given-strings/

//	String s1= “ABCDEF”
//
//			String s2= “DEFXYZ”
//
//			Output: DEF

	public void Test() {

		String s1 = "ABCDEF";
		String s2 = "DEFXYZ";

		String sItr = s1.length() > s2.length() ? s2 : s1;
		String sToCheck = sItr.contentEquals(s1) ? s2 : s1;
		String common = "";
		char[] aItr = sItr.toCharArray();
		for (int i = 0; i < aItr.length; i++) {

			if (sToCheck.contains(String.valueOf(aItr[i]))) {
				if (!common.contains(String.valueOf(aItr[i]))) {

					common = common + String.valueOf(aItr[i]) + " ";
				}
			}
		}
		System.out.println(common.trim());
	}

	@Test
	public void CollectionApproach() {
		String s1 = "ABCDEF";
		String s2 = "DEFXYZ";
		List<Character> ofirst = new ArrayList<Character>();
		List<Character> osecond = new ArrayList<Character>();

		for (int i = 0; i < s1.toCharArray().length; i++) {
			ofirst.add(s1.toCharArray()[i]);
		}

		for (int i = 0; i < s2.toCharArray().length; i++) {
			osecond.add(s2.toCharArray()[i]);
		}		
		System.out.println(ofirst.retainAll(osecond));
		
		System.out.println(ofirst);
		System.out.println(osecond);
		

	}

}
