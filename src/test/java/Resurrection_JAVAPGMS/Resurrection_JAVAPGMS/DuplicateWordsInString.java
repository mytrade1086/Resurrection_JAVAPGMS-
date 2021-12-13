package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class DuplicateWordsInString {

@org.testng.annotations.Test

public void Test() {
	
	//https://www.javatpoint.com/java-program-to-find-the-duplicate-words-in-a-string
	String str="big black bug bit a big black dog on his big black nose";
	String sVisited="";
	String[] aStr=str.split(" ");
	
	for(String s: aStr) {
	
		str=str.replaceFirst(s, "");
		if(str.contains(s)){
		System.out.println("Repeated Word=>"+s);}
		str=str.replace(s, "");
		
		}
		
		
	}
	
	}
	

