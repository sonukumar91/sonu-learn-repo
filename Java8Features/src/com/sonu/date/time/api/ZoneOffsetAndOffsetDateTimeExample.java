package com.sonu.date.time.api;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class ZoneOffsetAndOffsetDateTimeExample {

	public static void main(String args[]) {
		
		ZoneOffset zoneOffset = ZoneOffset.of("+05:30");
		OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset);
		System.out.println("Time in India now using offset : "+offsetDateTime);
	
		OffsetDateTime targetOffsetDateTime = offsetDateTime.withOffsetSameInstant(ZoneOffset.of("+01:00"));
		System.out.println("Time in Paris now using offset : "+targetOffsetDateTime);
	
	}
}
