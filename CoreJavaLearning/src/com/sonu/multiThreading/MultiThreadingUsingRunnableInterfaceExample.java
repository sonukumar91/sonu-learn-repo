package com.sonu.multiThreading;

class MyThread1 implements Runnable{
	
	public void run() {
		int i=1;
		while(i<=10) {
			System.out.println(i+" MyThred");
			i++;
		}
	}
}

public class MultiThreadingUsingRunnableInterfaceExample {

	public static void main(String[] args) {
		


		MyThread1 t = new MyThread1();
		Thread th = new Thread(t);
		th.start();
		
		int i=1;
		
		while(i<=10) {
			System.out.println(i+" Main Thread");
			i++;
		}
	

	}

}
