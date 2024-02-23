package com.sonu.optional.instace.method;

import java.util.Optional;

public class FilterMethodExample {

	public static void main(String[] args) {

		Optional<Integer> op1 = Optional.of(9456);
		System.out.println("Op1 : "+op1);
		
		Optional<Integer> op2 = Optional.empty();
		System.out.println("Op2 : "+op2);
		
		try {
			System.out.println("Filtered Value for odd or even for op1 : "+op1.filter(n -> n%2 ==0));
			System.out.println("Filtered Value for odd or even for op2 : "+op2.filter(n -> n%2 ==0));

		}catch (Exception e) { 
            System.out.println(e); 
        } 
		
		
		
		
	}

}
