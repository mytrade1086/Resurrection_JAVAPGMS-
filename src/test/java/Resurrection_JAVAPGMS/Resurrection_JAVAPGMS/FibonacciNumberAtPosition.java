package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class FibonacciNumberAtPosition {

	
	
	public static void main(String[] args) {
		int position=10;
		
		//0 1 1 2 3
		System.out.println(FibonacciAtPosition(position));
		
	}
	
	
	public static int FibonacciAtPosition(int n) {
		// Exit condition as explained above
		if (n == 0) {
			return 0;
		}

		// Exit condition as explained above
		if (n == 1) {
			return 1;
		}

		// This part is actually recursion. We know that fibonacci number at nth position is sum of numbers at positions (n-1) and (n-2).
		/*
		 * Suppose method is called as FibonacciAtPosition(5). Below times in sequence
		 * with reducing n , FibonacciAtPosition will be called. FibonacciAtPosition(5)
		 * = FibonacciAtPosition(4) + FibonacciAtPosition(3) FibonacciAtPosition(3) =
		 * FibonacciAtPosition(2) + FibonacciAtPosition(1) FibonacciAtPosition(4) =
		 * FibonacciAtPosition(3) + FibonacciAtPosition(2) FibonacciAtPosition(2) =
		 * FibonacciAtPosition(1) + FibonacciAtPosition(0) : At this point recurrsion
		 * will be stopped and 0+1=1 will ber eturned to immediate caller.
		 * 
		 * and in similar fashion fibonacci(4), fibonacci(3), fibonacci(2) will be
		 * recursively called.
		 */
		return FibonacciAtPosition(n - 1) + FibonacciAtPosition(n - 2);
	}

}
