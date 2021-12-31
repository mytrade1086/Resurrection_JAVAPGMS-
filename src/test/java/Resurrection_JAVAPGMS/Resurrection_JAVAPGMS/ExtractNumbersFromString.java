package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class ExtractNumbersFromString {
	
	
	@Test
	
	public void regex() {
		String str="This is new123 and 45 plus 2";	
	Pattern p=Pattern.compile("[0-9]+");
	Matcher m=  p.matcher(str);

	while(m.find()) {
		System.out.println(m.start()  +"==>"+m.group());
	}		
	}
	
	
	
@Test
	
	public void regex2() {
		
	Pattern p=Pattern.compile("9+");
	int sum=0;
	for(int i=1;i<100;i++) {
	Matcher m=  p.matcher(i+"");

	while(m.find()) {
		System.out.println(m.start()  +"==>"+m.group());
		sum=sum+(m.group().length())*9;	
	}
	}
	System.out.println(sum);
}
}
