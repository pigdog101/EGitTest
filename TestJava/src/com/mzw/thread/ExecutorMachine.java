package com.mzw.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMachine implements Runnable{
	private int a = 0 ;
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println(Thread.currentThread().getName() + "a=" + ++a);
		}
	}
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++) {
			es.execute(new ExecutorMachine());
			
		}
		es.shutdown();
		
	}
}
