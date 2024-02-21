package com.jspiders.cardekho.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho.entity.Car;

public class CarOperations {
	private List<Car> cars= new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	Car car;
	public void addCar() {
		System.out.println("How many cars you want to add? ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		for (int i = 1; i <=choice; i++) {
			car=new Car();
			System.out.println("Enter id: ");
			car.setId(sc.nextInt());
//			int id=sc.nextInt();
//			car.setId(id);
			System.out.println("Enter name: ");
			car.setName(sc.next());
			System.out.println("Enter brand: ");
			car.setBrand(sc.next());
			System.out.println("Enter fuel type: ");
			car.setFuelType(sc.next());
			System.out.println("Enter color: ");
			car.setColour(sc.next());
			System.out.println("Enter price: ");
			car.setPrice(sc.nextDouble());
			cars.add(car);
		}
	}
	public void viewAllCars() {
		boolean b=false;
		System.out.println("view all cars method: ");
		for (Car car : cars) {
		    if (cars.size()>0) {
		    	System.out.println(car);
		    	b=true;
		    	break;
			}
		}
		if (!b) {
			System.out.println("car not found");
		}
	}
	public void searchByName() {
		System.out.println("Enter the name of the car");
		String name=sc.next();
		String s=car.getName();
		if (s.equals(name)) {
			System.out.println(car);
		}
		else {
			System.out.println("this car does not exist!");
		}
	}
	public void searchByBrand() {
		System.out.println("enter the brand of the car: ");
		String brand=sc.next();
		String s2=car.getBrand();
		if (s2.equals(brand)) {
			System.out.println(car);
		}
		else {
			System.out.println("this brand does not exist!");
		}
	}
	public void searchByFuelType() {
		System.out.println("Enter the fuel type of the car");
		String fuel=sc.next();
		String s3=car.getFuelType();
		if (s3.equals(fuel)) {
			System.out.println(car);
		}
		else {
			System.out.println("this fuel type does not exist");
		}
		}
	public void searchByPrice() {
		System.out.println("Enter the price of the car");
		double price=sc.nextDouble();
		double s4=car.getPrice();
		if (s4==price) {
			System.out.println(car);
		}
		else {
			System.out.println("this price of car does not exist");
		}
	}
	public void removeCar() {
		boolean b=false;
		System.out.println("Enter the id to remove car");
		int id=sc.nextInt();
		for (Car car : cars) {
			if (car.getId()==id) {
				cars.remove(id);
				b=true;
				break;
			}
		}
		if (!b) {
			System.out.println("car not found");
		}
	}
	public void editCar() {
		boolean b=false;
		System.out.println("Enter the id to edit car");
		int id=sc.nextInt();
		for (Car car : cars) {
				if (car.getId()==id) {
					b=true;
					System.out.println("enter the price of car: ");
					double price=sc.nextDouble();
					car.setPrice(price);
					System.out.println("car price updated successfully");
				}
			}
			if (!b) {
			System.out.println("car not found");
		}
		
	}

}
