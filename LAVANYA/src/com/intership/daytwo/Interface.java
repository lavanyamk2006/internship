package com.intership.daytwo;

public class Interface implements Interfaceone,Interfacetwo {
	
	public void display() {
		System.out.println("Display Method");
		
	}
	public void print() {
	System.out.println("Print Method");
}
	public static void main(String[]args) {
		Interface i= new Interface();
		i.display();
		i.print();
		
	}


}
