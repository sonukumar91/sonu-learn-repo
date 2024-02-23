package com.sonu.staticKeywords;

class Test1 {
	static {
		System.out.println("Block 1");
	}
	static {
		System.out.println("Block 2");
	}
}

public class StaticBlockExample {

	public static void main(String[] args) {
		System.out.println("Main Block");

		Test1 t = new Test1();
	}

}
