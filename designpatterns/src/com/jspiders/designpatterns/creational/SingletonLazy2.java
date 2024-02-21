package com.jspiders.designpatterns.creational;

public class SingletonLazy2 {
	private static SingletonLazy2 singletonLazy;
	private SingletonLazy2() {
		System.out.println("constructor is invoked");
	}
	public static SingletonLazy2 getObject() {
		if (singletonLazy== null) {
			singletonLazy=new SingletonLazy2();
		}
		return singletonLazy;
	}
	

}
