package com.sonu.date.time.api;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class InstanctAndDurationAndPeriodAPIExample {

	public static void main(String args[]) {
		
		//Instant
		Instant instant = Instant.ofEpochSecond(6);
		System.out.println("Instant.ofEpochSecond(6) "+instant);
		System.out.println("Instant.ofEpochSecond(4, 1_000) : "+Instant.ofEpochSecond(4, 1_000));
		System.out.println("Instant.ofEpochSecond(4, -1_000) : "+Instant.ofEpochSecond(4, -1_000));
		
		Instant instant2 = Instant.now();
		System.out.println("Instant.now() "+instant2);
		
		
		//Duration
		Duration instDuration = Duration.between(instant, instant2);
		System.out.println("Duration.between(instant, instant2) "+instDuration);
		
		LocalTime time = LocalTime.of(12, 30, 10);
		LocalTime time1 = LocalTime.now();
		Duration duration = Duration.between(time, time1);
		System.out.println("Duration.between(time, time1) "+duration);
		
		LocalDateTime dateTime = LocalDateTime.of(1999, Month.JULY,16,12,30,10);
		LocalDateTime dateTime2 = LocalDateTime.now();
		Duration duration2 = Duration.between(dateTime, dateTime2);
		System.out.println(" Duration.between(dateTime, dateTime2) "+duration2);
		System.out.println(" duration2.toDays() "+duration2.toDays());
		System.out.println(" duration2.toHours() "+duration2.toHours());
		System.out.println(" duration2.toSeconds() "+duration2.toSeconds());
		System.out.println(" duration2.toString() "+duration2.toString());
		System.out.println(" duration2.getSeconds() "+duration2.getSeconds());
		
		LocalDate date = LocalDate.of(1999, 07, 16);
		LocalDate date2 = LocalDate.now();
		Period period= Period.between(date, date2);
		System.out.println("Period.between(date, date2) "+period);
		System.out.println("period.getYears() "+period.getYears());
		System.out.println("period.getMonths() "+period.getMonths());
		System.out.println("period.getDays() "+period.getDays());
		System.out.println("period.toString() "+period.toString());
		System.out.println("period.toTotalMonths()"+period.toTotalMonths());

		
		
		
	}
	
}
