package com.sonu.optional.instace.method;

import java.util.Optional;

public class OrElseAndIfPresentMethodExample {

	public static void main(String[] args) {

		// 1.orElse()

		Optional<Integer> op1 = Optional.of(548);
		System.out.println("Op1 : " + op1);

		Optional<Integer> op2 = Optional.empty();
		System.out.println("Op2 : " + op2);

		System.out.println("orElse() by op1 :" + op1.orElse(100));
		System.out.println("orElse() by op2 :" + op2.orElse(100));

		// 2.orElseGet()

		System.out.println("orElse() by op1 :" + op1.orElseGet(() -> (int) (Math.random() * 10)));
		System.out.println("orElse() by op2 :" + op2.orElseGet(() -> (int) (Math.random() * 10)));

		// 3.ifPresentOrElse

		op1.ifPresentOrElse((value) -> {
			System.out.println("Value of op1 is Presents, its: " + value);}, 
				() -> {
			System.out.println("value of op1 is empty");}
				);
		op2.ifPresentOrElse((value) -> {
			System.out.println("Value of op2 is Presents, its: " + value);}, 
				() -> {
			System.out.println("value of op2 is empty");}
				);
		
		//4.orElseThrow()
		Optional<Integer> op3 = (Optional<Integer>) Optional.empty().orElseThrow(()-> new RuntimeException("Optional is Empty"));
		System.out.println("Op3 : " + op3.get());

	}

}
