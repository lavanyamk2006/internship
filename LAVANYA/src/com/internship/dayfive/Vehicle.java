package com.internship.dayfive;

abstract class Vehicle implements Rentable {
	
	private int vehicleId;
	private String model;
	private double baseRate;
	
public void Vehicle(int vehicleId,String model,double baseRate) {
	
	if(baseRate<0)throw new IllegalArgumentException("Base rate cannot be negative.");
	
	if(model==null||model.trim().isEmpty())throw new IllegalArgumentException("Model name cannot be empty");
	
	this.vehicleId=vehicleId;
	this.model=model;
	this.baseRate=baseRate;
}

public int getVehicleId() {
	return vehicleId;
}
public String getModel() {
	return model;
}
public double getBaserate() {
	return baseRate;
}

public void displayDetails() {
	System.out.println("Vehicle ID:"+vehicleId);
	System.out.println("Model:"+model);
	System.out.println("BaseRate:"+baseRate);	
}
}
