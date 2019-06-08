package com.mzw.thread;

import java.util.Timer;
import java.util.TimerTask;

public class InteruptMachine extends Thread{
	Timer timer = new Timer();
	private int a= 0;
	public void run() {
		final Thread thread = Thread.currentThread();
		TimerTask timeTask = new TimerTask() {
			public void run() {
				System.out.println(thread.getName() + "has wait for 3 second");
				thread.interrupt();
			}
		};
		while(true) {
			synchronized (this) {
				while(a>3) {
					timer.schedule(timeTask, 3000);
					try {
						this.wait();
					} catch (InterruptedException e) {
						System.out.println("thread has been interrupted");
						return;
					}
				}
			}
			System.out.println("a-->" + a);
			a++;
		}
		
		
	}
	public static void main(String[] args) {
		new InteruptMachine().start();
	}
}
