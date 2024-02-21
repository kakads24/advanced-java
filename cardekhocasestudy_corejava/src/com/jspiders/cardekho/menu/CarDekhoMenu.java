package com.jspiders.cardekho.menu;

import java.util.Scanner;

import com.jspiders.cardekho.operations.CarOperations;
	

public class CarDekhoMenu {
	static boolean b=true;
	static CarOperations op=new CarOperations();
	public static void main(String[] args) {
		
		while (b) {
			mainMenu();
		}
		
		
	}
	private static void mainMenu() {
		System.out.println("=====MENU=====\n"+
				"1. view all cars\n"+
	            "2. search car\n"+
				"3. add car\n"+
                "4. Remove car\n"+
	            "5. Edit car\n"+
                "6. Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: 
			op.viewAllCars();	
			break;
		case 2: 
			System.out.println("=====Search Car=====\n"+
					"1. search by name\n"+
		            "2. search by brand\n"+
					"3. search by fuel type\n"+
                    "4. search by price\n"+
		            "5. Go back\n");
			int choice1=sc.nextInt();
			System.out.println("Enter your choice: ");
			switch (choice1) {
			case 1: 
				op.searchByName();
				break;
			case 2: 
			   	op.searchByBrand();
				break;
			case 3: 
				op.searchByFuelType();
				break;
			case 4: 
				op.searchByPrice();
				break;
			case 5: 
				System.out.println("Go back to main menu...");
				mainMenu();
				break;
			default:
				System.out.println("Invalid Input, Please Try Again");
			    break;
		    }
		    break;
		case 3: 
			op.addCar();
			break;
		case 4: 
			op.removeCar();
			break;
		case 5: 
			op.editCar();
			break;
		case 6: 
			System.out.println("thank you visit again");
			b=false;
			break;
		default:
			System.out.println("invalid choice, please enter valid input");
			break;	
	}
}}
