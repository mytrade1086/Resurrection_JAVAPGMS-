package Concepts;

public class ExceptionMessgaes {

	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		
		
		try {
		System.out.println(a/b);
		}
		
		catch(Exception ex) {
			
			
			//System.out.println(ex.toString());// java.lang.ArithmeticException: / by zero
			//System.out.println(ex.getMessage());/// by zero
			
			
			ex.printStackTrace();
//			java.lang.ArithmeticException: / by zero
//			at Concepts.ExceptionMessgaes.main(ExceptionMessgaes.java:14)
			
		}
	}
	
}
