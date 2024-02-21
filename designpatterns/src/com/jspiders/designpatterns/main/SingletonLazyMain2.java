package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.SingletonLazy2;

public class SingletonLazyMain2 {
	public static void main(String[] args) {
		SingletonLazy2  singletonLazy2=SingletonLazy2.getObject();
		System.out.println(singletonLazy2);
		SingletonLazy2 singletonLazy3=SingletonLazy2.getObject();
		System.out.println(singletonLazy3);
	}
}
