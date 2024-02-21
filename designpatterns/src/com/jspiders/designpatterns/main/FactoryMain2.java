package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.Beverage2;
import com.jspiders.designpatterns.creational.GreenTea2;
import com.jspiders.designpatterns.creational.LemonTea2;

public class FactoryMain2 {
	public static void main(String[] args) {
		try {
			Factory().order();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static Beverage2 Factory() {
		Beverage2 beverage2=null;
		
		System.out.println("enter 1 to order greentea \nenter 2 to order lemon-t");
		System.out.println("enter your choice");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			beverage2=new GreenTea2();
			break;
		case 2:
			beverage2=new LemonTea2();
			break;
		default:
			System.out.println("invalid choice");
		}
		return beverage2;
		
	}
}
