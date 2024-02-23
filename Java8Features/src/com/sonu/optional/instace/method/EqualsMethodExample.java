package com.sonu.optional.instace.method;

import java.util.Optional;

public class EqualsMethodExample {

	public static void main(String[] args) {

		Optional<Integer> op1 = Optional.of(456);
		System.out.println("Optional 1:" + op1);

		Optional<Integer> op2 = Optional.of(456);
		System.out.println("Optional 2:" + op2);

		Optional<Integer> op3 = Optional.empty();
		System.out.println("Optional 3:" + op3);

		System.out.println("Comparing Optional 1" + " and Optional 2: " + op1.equals(op2));
	
		System.out.println("Comparing Optional 2" + " and Optional 3: " + op2.equals(op3));

	}

}
