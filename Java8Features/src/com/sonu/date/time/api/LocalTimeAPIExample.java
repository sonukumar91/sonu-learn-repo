package com.sonu.date.time.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalTimeAPIExample {

	public static void main(String[] args) {

		// creating methods : now(),of(),parse()
		LocalTime time = LocalTime.now();
		System.out.println("now : " + time);
		LocalTime time1 = LocalTime.of(12, 30, 10);
		System.out.println("of : " + time1);
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println("format : " + formatter.format(time));

		LocalTime time2 = LocalTime.parse("10:15:45");
		System.out.println("Parse : " + time2);
		LocalTime time3 = LocalTime.parse("12:15:45",DateTimeFormatter.ISO_TIME);
		System.out.println("Parse with formatter: " + time3);

		
		// operation methods or utility methods
		int hour = time.getHour();
		int minutes = time.getMinute();
		int seconds = time.getSecond();
		int nano = time.getNano();

		System.out.println("value of the time " + time + " hour = " + hour + " minutes = " + minutes + " seconds = " + seconds+" nano seconds = "+nano);

		int hour1 = time.get(ChronoField.HOUR_OF_DAY);
		int minutesofHour = time.get(ChronoField.MINUTE_OF_HOUR);
		int minutesofDay = time.get(ChronoField.MINUTE_OF_DAY);
		int secondsofDay = time.get(ChronoField.SECOND_OF_DAY);
		int secondsOfMinutes = time.get(ChronoField.SECOND_OF_MINUTE);

		System.out.println("ChronoField value of the time " + time + " hour of Day = " + hour1 + " MINUTE_OF_HOUR = " 
								+ minutesofHour + " MINUTE_OF_DAY = " + minutesofDay+" SECOND_OF_DAY = "+secondsofDay+" SECOND_OF_MINUTE = "+secondsOfMinutes);


		LocalTime hourPlus   = time.plusHours(2);
		LocalTime minutePlus = time.plusMinutes(15);
		LocalTime secondsPlus = time.plusSeconds(20);
		
		System.out.println("Plus value of the time " + time + " hour = " + hourPlus + " minutes = " + minutePlus + " seconds = " + secondsPlus);
		
		LocalTime hourMinus   = time.minusHours(2);
		LocalTime minuteMinus = time.minusMinutes(20);
		LocalTime secondsMinus = time.minusSeconds(50);
		
		System.out.println("Minus value of the time " + time + " hour = " + hourMinus + " minutes = " + minuteMinus + " seconds = " + secondsMinus);
	}

}
