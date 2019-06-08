package com.mzw.thread;

public class ThreadStatus extends Thread{
	private Sucai sucai;
	
	public ThreadStatus() {
		super();
	}
	public ThreadStatus(Sucai sucai) {
		super();
		this.sucai = sucai;
	} 
	public void run() {
		
		for(int i=0;i<100;i++) {
			synchronized (sucai) {
			try {
				sucai.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("yiyiyi"+"-->"+i);
			
		}
		}
	}
	public static void main(String[] args) {
		Sucai sucai = new Sucai();
		
		new ThreadStatus(sucai).start();
		new Thread2(sucai).start();
		
	}
}
class Thread2 extends Thread{
	private Sucai sucai;
	public void run() {
		for(int i=0;i<100;i++) {
			synchronized (sucai) {
			sucai.notifyAll();
			System.out.println("ererer"+"-->"+i);
			}
		}
	}
	public Thread2(Sucai sucai) {
		super();
		this.sucai = sucai;
	}
	public Thread2() {
		super();
	}
	
}

class Sucai{
	private String juzi;
	private String pingguo;
	public Sucai() {
	}
	
}

