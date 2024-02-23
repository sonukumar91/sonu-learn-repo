package com.sonu.optional;

import java.util.Optional;

public class OptionalClassStaticMethodExample {
	/*
	 * 1.empty() 2.of(T value) 3.ofNullable(T value)
	 */
	public static void main(String[] args) {

		String[] str = new String[5];
		
		str[2] = "Geeks Classes are coming soon";
		
		//1.empty()
		Optional<String> emptyOpt = Optional.empty();
		System.out.println("Empty :"+emptyOpt);
		
		//2.of()
		Optional<String> value = Optional.of(str[2]);
		System.out.println("of() :"+value.get());
		
		//3.ofNullable()
		Optional<String> value1 = Optional.ofNullable(str[2]);
		System.out.println("ofNullable with value:"+value1.get());
		
		Optional<String> value2 = Optional.ofNullable(null);
		System.out.println("ofNullable with null :"+value2);
	}

}
