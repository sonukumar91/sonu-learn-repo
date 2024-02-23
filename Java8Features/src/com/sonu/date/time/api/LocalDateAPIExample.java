package com.sonu.date.time.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateAPIExample {

	public static void main(String[] args) {

		// creating methods : now(),of(),parse()
		LocalDate date = LocalDate.now();
		System.out.println("now : " + date);
		LocalDate date1 = LocalDate.of(1999, 7, 16);
		System.out.println("of : " + date1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, YYYY");
		System.out.println("format : " + formatter.format(date));

		LocalDate dt1 = LocalDate.parse("2021-01-07");
		System.out.println("Parse : " + dt1);

		LocalDate result = dt1.withDayOfYear(01);
		System.out.println("The date with day of year is: " + result);

		// operation methods or utility methods
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();

		System.out.println("value of the date " + date + " year = " + year + " month = " + month + " day = " + day);

		Month monthName = date.getMonth();
		DayOfWeek dow = date.getDayOfWeek();

		System.out.println("value of the date " + date + " month Name = " + monthName + " day Name = " + dow);

		int monLen = date.lengthOfMonth();
		int yearLen = date.lengthOfYear();
		boolean isLeap = date.isLeapYear();
		
		System.out.println("value of the date " + date + " Year Length = " + yearLen+ " month Length = " + monLen + " is Leap Year = " + isLeap);

		int year1 = date.get(ChronoField.YEAR);
		int month1 = date.get(ChronoField.MONTH_OF_YEAR);
		int day1 = date.get(ChronoField.DAY_OF_MONTH);
		
		System.out.println("ChronoField value of the date " + date + " year = " + year1 + " month = " + month1 + " day = " + day1);
	
		LocalDate yearPlus   = date.plusYears(2);
		LocalDate  monthPlus = date.plusMonths(8);
		LocalDate dayPlus = date.plusDays(10);
		
		System.out.println("Plus value of the date " + date + " year Plus  = " + yearPlus + " month plus = " + monthPlus + " day plus = " + dayPlus);
	}

}
