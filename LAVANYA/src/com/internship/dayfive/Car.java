package com.internship.dayfive;

class Car extends Vehicle {
	
	private String carType;
	private double insuranceFee;
	
public void car(int vehicleId,String model,double baseRate,String carType,double insuranceFee) {
	
	this.carType=carType;
	this.insuranceFee=insuranceFee;
}
@Override
public double calculateRental(int days)throws InvalidRentalException{
	if(days<=0)throw new InvalidRentalException("Rental days must be positive.");
	return getBaseRate()*days+insuranceFee;
}
@Override
public void displayDetails() {
	super.displayDetails();
	System.out.println("car Type:"+carType);
}

}
