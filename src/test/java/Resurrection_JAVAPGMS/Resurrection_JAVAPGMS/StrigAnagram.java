package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import org.testng.annotations.Test;

public class StrigAnagram {

	// http://makeseleniumeasy.com/2019/05/20/frequently-asked-java-programs-34-java-program-to-check-if-two-strings-are-anagram/
	// For example:- SILENT and LISTEN are anagrams.
	@Test
	public void Anagram() {

		String sFirst = "ELS";
		String sSecod = "SEL";
		System.out.println(AreStringEqual(sFirst,sSecod));
		
	}
	
	
	public boolean AreStringEqual(String sFirst,String sSecod) {
		
		if (sFirst.trim().equals(sSecod)) {
			System.out.println("Equal");
			return true;
		}
		
		if (sFirst.trim().length() != sSecod.trim().length()) {
			System.out.println("Length not equal");
			return false;
		}

		for (int i = 0; i < sFirst.length(); i++) {
			String temp = String.valueOf(sFirst.charAt(i));
			if (sSecod.contains(temp)) {
				sSecod.replace(temp, "");
				sFirst.replace(temp, "");

				if (sFirst.trim().length() != sSecod.trim().length()) {
					System.out.println("Length not equal");
					return false;
				}
				
			}
			else {
				return false;
			}
		}		
		return true;
	}
}
