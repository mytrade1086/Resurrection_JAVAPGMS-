package Concepts;

public class TimeInMilliSeconds {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		long timeAfter60seconds=System.currentTimeMillis()+60000;//curret time plus 60 seconds
		
		
		//long timeNow=System.currentTimeMillis();
		
		while((timeAfter60seconds-System.currentTimeMillis())>0) {
			Thread.sleep(1000);
			System.out.println(timeAfter60seconds-System.currentTimeMillis());
		}
		
	}
}
