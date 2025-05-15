package com.intership.daytwo;

public class MethodOverloading() {
    int add(int a,int b, int c) {
    return a+b+c;
    } 
    float add(int a,float b) {
    return a+b;
    
	int add(int a,int b) {
	return a+b;
	}	
    float add(float a,int b) {
    return a+b;
    }
    
public static void main(String[]args)
{
	MethodOverloading m=new MethodOverloading();
	System.out.println(m.add(27,34));
	System.out.println(m.add(24,35,45));
	System.out.println(m.add(24,32.2f));
	System.out.println(m.add(23.2f,32));
	
	
}
}

