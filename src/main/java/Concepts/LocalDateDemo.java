package Concepts;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		
		LocalDate dt=LocalDate.now();		
		LocalDate dt2=dt.plusDays(1);
		
		
		System.out.println(dt.compareTo(dt2));
		
		System.out.println(dt.atTime(LocalTime.now()));
		
		System.out.println(dt2.atTime(LocalTime.now()));
		
		    // dt2.dt
	}
	
}
