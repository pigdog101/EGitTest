package com.mzw.reflect;

public class SyncThread {
	public static void main(String[] args) {
		Stack stack = new Stack("stack1");
		Producer producer1 = new Producer("producer1",stack);
		Customer customer1 = new Customer("customer1",stack);
	}  
}
	class Stack {
		Object[] buffer = new Object[200];
		String name = "";
		private int point = -1;
		public Stack(String name) {
			this.name = name;
		}
		public synchronized void push(Object object) {
			point ++;
			buffer[point] = object;
		}
		public  Object pop() {
			if(point ==-1)return null;
			Object o = buffer[point];
			buffer[point] = null;
			Thread.yield();
			point--;
//			
			return o;
		}
		public String getName() {
			return name;
		}
	}
	class Producer extends Thread{
		private Stack thestack;
		public Producer(String name,Stack stack) {
			super(name);
			thestack = stack;
			start();
		}
		public void run() {
			for(int i=0;i<=50;i++) {
//				synchronized(thestack) {
				String goods = "goods" + i;
				System.out.println("生产了111111111111"+goods);
				thestack.push(goods);
				try {
					this.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
//				}
//				yield();
			}
		}
	}
	class Customer extends Thread{
		private Stack thestack;
		public Customer(String name,Stack stack) {
			super(name);
			thestack = stack;
			start();
		}
		public void run() {
			for(int i=0;i<=50;i++) {
//				synchronized (thestack) {
				String goods=(String) thestack.pop() ;
				System.out.println("消费了"+goods);
				try {
					this.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
//				}
//				yield();
			}
		}
	}

