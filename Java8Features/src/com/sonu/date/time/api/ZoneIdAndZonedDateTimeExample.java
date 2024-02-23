package com.sonu.date.time.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdAndZonedDateTimeExample {

	public static void main(String[] args) {

		ZoneId        india = ZoneId.of("Asia/Kolkata");
		ZonedDateTime inidaDateTime = ZonedDateTime.now(india);
		System.out.println("Time in India now : "+inidaDateTime);
		
		ZonedDateTime parisZoneDateTime = inidaDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris"));
		System.out.println("Time in Paris now : "+parisZoneDateTime);
		
	}

}
