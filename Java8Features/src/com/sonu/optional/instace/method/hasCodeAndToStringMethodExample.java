package com.sonu.optional.instace.method;

import java.util.Optional;

public class hasCodeAndToStringMethodExample {

	public static void main(String[] args) {

		Optional<Integer> op1 = Optional.of(456);
		System.out.println("op1 : "+op1);
		
		Optional<Integer> op2 = Optional.empty();
		System.out.println("op2 : "+op2);
		
		System.out.println("Op1 hashcode : "+op1.hashCode());
		System.out.println("Op2 hashcode : "+op2.hashCode());
		
		System.out.println("Op1 toString : "+op1.toString());
		System.out.println("Op2 toString : "+op2.toString());
		
	}

}
