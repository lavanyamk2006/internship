package com.internship.dayfive;

import java.util.Scanner;

public class VehicleRentalSystem {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rentable[]vehicle=new Rentable[2];
		
	try {
		// first vehicle-car
		System.out.println("Enter vehicle Type(1-car,2-Bike):");
		int type=sc.nextInt();
		System.out.println("Enter Vehicle ID:");
		int id=sc.nextInt();
		sc.nextLine();//consume new lines
		System.out.println("Enter model:");
		String model=sc.nextLine();
		System.out.println("Enter Base Rate:");
		double rate=sc.nextDouble();
		
		if(type==1) {
			sc.nextLine();//consume newLine
			System.out.println("Enter car Type:");
			String carType=sc.nextLine();
			System.out.println("Enter Insurance Fee:");
			double insurance=sc.nextDouble();
			vehicle[0]=new Car();
		}
		//second vehicle-Bike
		System.out.println("Enter vehicle Type(1-car,2-Bike):");
		
		type=sc.nextInt();
		System.out.println("Enter vehicle ID:");
		id=sc.nextInt();
		sc.nextLine();//consume newline
		System.out.println("Enter model:");
		model=sc.nextLine();
		System.out.println("Enter Base Rate:");
		rate=sc.nextDouble();
		
		if(type==2) {
			System.out.println("Enter Engine CC:");
			int CC=sc.nextInt();
			System.out.println("Enter helemt Rental Fee:");
			double helmetFee=sc.nextDouble();
			vehicle[1]=new Bike(id,model,rate,CC,helmetFee);
			
		}

		System.out.println("Enter rental days for all vehicles:");
		int days=sc.nextInt();
		if(days<=0) {
			throw new InvalidRentalException("Rental days must be greater than zero:");
		}
		System.out.println("\n vehicles Rental Details---");
		
		for(Rentable v:vehicle) {
			v.displayDetails();
			double total=v.calculateRental(days);
			System.out.println("Total Rental("+days+"days):"+total);
			
		}
	}catch(InvalidRentalException e) {
		System.out.println("Rental error:"+e.getMessage());
		
	}catch(Exception e) {
		System.out.println("InvalidRenatlException:"+e.getMessage());
	}
	sc.close();
		
	}
		
	}

		
		
		
			
		
	
			

