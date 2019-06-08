package com.mzw.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	/*
	 * 获取class对象
	 */
	
	public void test() {
		say();
	}
	public static void say() {
		System.out.println("sya");
	}
	public static void Demo01() throws Exception{
		Class clazz01 = Class.forName("com.mzw.reflect.reflectTest01");
		Class clazz02 = reflectTest01.class;
		reflectTest01 rt = new reflectTest01(1,"mzw",22); 
		Class clazz03 = rt.getClass();
		System.out.println(clazz01);
		System.out.println(clazz02);
		System.out.println(clazz03);
	}
	//获取方法
	public static void Demo02() {
		Class clazz=null;
		try {
			clazz = Class.forName("com.mzw.reflect.reflectTest01");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		Method[] methods = clazz.getMethods();
		for(Method method: methods) {
			System.out.println(method);
			
		}
		//获取当前类的所有方法不会获取父类以及接口的方法，而且可以拿到私有的方法
		System.out.println("-------------------------");
		Method[] declaredMethods = clazz.getDeclaredMethods();
		
	}
	//获取接口
	public static void Demo03() {
		Class clazz=null;
		try {
			clazz = Class.forName("com.mzw.reflect.reflectTest01");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		Class[] inter = clazz.getInterfaces();
	}
	//获取父类
	public static void Demo04() {
		Class clazz=null;
		try {
			clazz = Class.forName("com.mzw.reflect.reflectTest01");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		Class Super = clazz.getSuperclass();
	}
	//获取当前类的属性并映射到实例中去
	public static void Demo05() throws Exception, Exception {
		Class clazz=null;
		try {
			clazz = Class.forName("com.mzw.reflect.reflectTest01");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		reflectTest01 rt = (reflectTest01)clazz.newInstance();
		Field field = clazz.getDeclaredField("id");
		Field[] fields = clazz.getDeclaredFields();
		for(Field f:fields) {
			f.setAccessible(true);
			Object o = f.get(rt);
			if(o!=null) {
				
			}
		}
		field.setAccessible(true);
		field.set(rt, 1);
		
		System.out.println(rt.getId());
		
		System.out.println("----------------------------");
		Method method  =  clazz.getDeclaredMethod("getId", null);
		method.invoke(rt, null);
		
	}
	public static void main(String[] args) throws Exception {
//		Demo01();
//		Demo02();
//		Demo05();
		new Test().test();
	}
}
