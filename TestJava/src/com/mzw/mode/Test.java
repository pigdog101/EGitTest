package com.mzw.mode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Door realSubject = new DoorRealSubject();
		InvocationHandler handler = new DynamicSubject(realSubject);
		Door door = (Door)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
		door.shutDown();
	}
}
