package com.sonu.multiThreading;

public class MultiThreadingUsingThreadClassExtracExample_2 extends Thread {

	public void run() {
		int i=1;
		while(i<=10) {
			System.out.println(i+" MyThred");
			i++;
		}
	}
	
	public static void main(String[] args) {

		MultiThreadingUsingThreadClassExtracExample_2 t = new MultiThreadingUsingThreadClassExtracExample_2();
		t.start();
		
		int i=1;
		
		while(i<=10) {
			System.out.println(i+" Main Thread");
			i++;
		}
	}

}
