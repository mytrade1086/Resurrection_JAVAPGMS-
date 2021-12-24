package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class FactorialRecursion {

	public static void main(String[] args) {


		int sum=factorial(3);
		System.out.println(sum);
	}




public static int factorial(int n) {
	
	int fact=1;
	if(n>1) {
		
		 fact=n*factorial(n-1);
	}
	return fact;
	
}
}


