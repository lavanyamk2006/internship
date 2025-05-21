package com.internship.dayfive;

interface Rentable {
	
	void displayDetails();
	
	double calculateRental(int days)throws InvalidRentalException;

}
