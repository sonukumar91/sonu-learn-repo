package com.sonu.date.time.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateAndTimeAPIExample {

	public static void main(String[] args) {

		LocalDateTime dateAndTime = LocalDateTime.now();
		System.out.println("Date And Time now : " + dateAndTime);

		LocalDateTime dateTime = LocalDateTime.of(1999, Month.JULY, 16, 12, 30, 10);
		System.out.println("Date And Time of  : " + dateTime);

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime2 = LocalDateTime.of(date, time);

		System.out.println("Date And Time using LocalDtae and Local Dtae : " + dateTime2);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
		String dateTime3 = dateAndTime.format(formatter);
		System.out.println("Date And Time using format : " + dateTime3);

		LocalDateTime parseDtaeAndTime = LocalDateTime.parse(dateTime3, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a").withLocale(Locale.ENGLISH));
		System.out.println("Parse Date Time : "+parseDtaeAndTime);
		
		LocalDateTime lt = LocalDateTime.parse("2018-12-30T19:34:50.63");

		System.out.println("LocalDateTime parse : " + lt);

		LocalDateTime localDateTime1 = dateAndTime.plusYears(1).plusMonths(1).plusWeeks(1).plusDays(1);
		System.out.println("Plus DateTime : "+localDateTime1);

		LocalDateTime localDateTime4 = dateAndTime.minusHours(1).minusMinutes(1).minusSeconds(1).minusNanos(100);
		// Print statement
		System.out.println("Minus DateTime : "+localDateTime4);
	}

}
