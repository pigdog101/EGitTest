package com.mzw.mode;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

	private Singleton() {
	}
	private static Singleton singleton = null;
	public static Singleton getInsetans() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}
}
