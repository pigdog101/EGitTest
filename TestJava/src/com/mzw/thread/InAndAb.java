package com.mzw.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InAndAb extends AbstractTest implements InterfaceTest{
	public  void say() {
		System.out.println(t1 + "--------------" + t2);
		
	}
	public static void main(String[] args) {
		List list = new ArrayList();
		int i = 1;
		
		list.iterator();
		new InAndAb().say();
	}
	
}
