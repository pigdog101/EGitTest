package com.mzw.mode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler{
	Object realSubject;
	public DynamicSubject(Object realSubject) {
		this.realSubject = realSubject;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();
		method.invoke(realSubject, args);
		this.after();
		return null;
	}
	public void before() {
		System.out.println("before");
	}
	public void after() {
		System.out.println("after");
	}
}
