package com.sonu.multiThreading;

class MyThread extends Thread{
	
	public void run() {
		int i=1;
		while(i<=10) {
			System.out.println(i+" MyThred");
			i++;
		}
	}
}

public class MultiThreadingUsingThreadClassExtracExample_1 {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		
		int i=1;
		
		while(i<=10) {
			System.out.println(i+" Main Thread");
			i++;
		}
	}

}
