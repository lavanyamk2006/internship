package com.intership.daytwo;

public class ParentClass {
	
	    int add(int a,int b) {
	    System.out.println("ParentClass");
	    return a+b;
	    } 
	    int add(int a,int b,int c) {
	    	System.out.println("ParentClass");
	    	return a+b+c;
	    }
	    float add(float a,float b) {
	    System.out.println("ParentClass");
	    return a+b;
	    }
		float add(int a,float b) {
			System.out.println("ParentClass");
			return a+b;
		}
		

}
