package com.intership.daytwo;

public class ConstructorOverloading {
	//default constructor
	public ConstructorOverloading() {
	  System.out.println("default constructor");
}
	int ConstructorOverloading(int a, int b) {
		return a+b;
	}
	int ConstructorOverloading(int a) {
		return a;
	}
	public static void main(String[]args) {
	  ConstructorOverloading c =new ConstructorOverloading();
	  c.ConstructorOverloading(54);
      c.ConstructorOverloading(24,34);
	}

}
