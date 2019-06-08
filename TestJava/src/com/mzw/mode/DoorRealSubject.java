package com.mzw.mode;

public class DoorRealSubject implements Door{

	@Override
	public void shutDown() {
		System.out.println("动态代理的真实角色");
	}

}
