package com.mzw.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMachine implements Runnable{
	private int a = 0;
	Lock machineLock = new ReentrantLock();
	public void run() {
		
		machineLock.lock();
		try {
			a++;
			Thread.currentThread().sleep(1000);;
			System.out.println(Thread.currentThread().getName() + "a=" + a);
		} catch (Exception e) {
			return;
		}finally {
			machineLock.unlock();
		}
	}
	public static void main(String[] args) {
		LockMachine lockMachine = new LockMachine();
		for(int i = 0;i<10;i++) {
			Thread thread = new Thread(lockMachine);
			thread.start();
		}
	}
}
