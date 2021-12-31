package Concepts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.time.temporal.TemporalUnit;

public class LocaltimeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
//		LocalDateTime now=LocalDateTime.now();
//		DateTimeFormatter df=DateTimeFormatter.ofPattern(" dd-MM-yyyy hh:mm:ss");
//		System.out.println(now);	
//		
//	  // LocalTime max=LocalTime.now().plusSeconds(30)
//		LocalDateTime max=now.plusSeconds(30);
//		
//		System.out.println(max);
//		
//		while(!max.equals(LocalDateTime.now())){
//			System.out.println("Not Equal");
//			Thread.sleep(1000);
//			System.out.println(LocalDateTime.now());
//			
//			
//		}
//	   
//		System.out.println(max);
//		System.out.println(LocalDateTime.now());
			   
	 
	   
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalTime max=lt.plusSeconds(30);
		System.out.println(max);
		
		
		System.out.println(max.compareTo(lt));
		System.out.println(LocalTime.now().compareTo(max));
		
		
		//System.out.println(max.);
		
		
		while(LocalTime.now().compareTo(max)!=1) {
			Thread.sleep(5000);
			System.out.println(" still waiting");
			System.out.println(LocalTime.now());
			System.out.println(max);
			
		}
		
		System.out.println("Wait Over");
		System.out.println(LocalTime.now());
		System.out.println(max);
		
		
		//https://stackoverflow.com/questions/15134927/difference-in-seconds-between-two-dates-using-joda-time
//		DateTime now = DateTime.now();
//		DateTime dateTime = now.plusMinutes(10);
//		Seconds seconds = Seconds.secondsBetween(now, dateTime);
//		System.out.println(seconds.getSeconds());

	}
}
