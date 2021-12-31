package ArrayPgms;

public class StringProblemWorldLine {

	public static void main(String[] args) {
		
		int counter=1;
		String str="India is a democratic country. Capital of India is Delhi. India has 28 states and 9 union territories, Delhi is also an union territory.";

		
		int index=0;
		for(int i=0;i<str.length();i=i+counter) {
		System.out.println(str.substring(i,counter));
		counter++;
		 str="str.substring(i,counter)";
		
		
		}
		
	}
	
	
}



//i nd ia_