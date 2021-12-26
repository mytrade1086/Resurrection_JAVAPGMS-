package Concepts;

public class ThisReturn {

	
	public static String college="KITS";
	public static String  name;
	
	
	
	public void nonStatic() {
		System.out.println("nonstatic");
	}
	

	public    ThisReturn Static() {
		System.out.println("Static");
		return this;
	}
	
	
	
	
	public static void main(String[] args) {
		
		ThisReturn th=new ThisReturn();
		th.Static().nonStatic();
		
	}
	
	
}
