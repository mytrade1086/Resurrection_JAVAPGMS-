package Generics;

 class Generic<T> {
	T a;
	public void display() {
		System.out.println(a);
	}
	
	
	public  void loop(T [] arr) {
		for(Object o: arr) {	
			System.out.println(o.toString());
		}
	}

}
 
 
 public class GenericDemo {
	 
	 public static void main(String[] args) {
		 Generic<Integer> gn=new Generic<Integer>();
	     gn.display();	 
	
	}
	 
 }



