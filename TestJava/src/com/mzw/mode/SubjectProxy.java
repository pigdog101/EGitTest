package com.mzw.mode;

public class SubjectProxy extends Subject{
	Subject sub = new RealSubject(); 
	
	public void before() {
		System.out.println("收房租之前先打扫");
	}
	public void after() {
		System.out.println("拿到房租之后那一部分的提成");
	}
	@Override
	public void rent() {
		this.before();
		sub.rent();
		this.after();
	}

}
