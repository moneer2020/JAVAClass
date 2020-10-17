package com.syntax.class02;

public class IfStatement {

	public static void main(String[] args) {

		
		//If statement is called control flow statement 
		
		System.out.println("my first if statement");

		int num1=1800;
		int num2=900;
		
		if(num1>num2) {
			
			System.out.println("num1 is bigger than num2");
		}
		
		System.out.println("if statement is ened");

		
		
		System.out.println(".................................");

		
		int temp=60; 
		
		if(temp>=60) {
		System.out.println("I am going to the beach");
		}else {
		System.out.println(" I will go for walk");
		
		}
		
		System.out.println("...................................");
		
		
		double expectedHours=15;
		double actualHours=10;
		
		if(actualHours<=expectedHours) {
			System.out.println("You will love the course and will succeed");
		}else { 
			System.out.println("Course will be hard for you");
		}
		
		
	
		


	double money=5;
	double iceCream=4.45;
	
	if (money<iceCream) {
		System.out.println("I will buy will IceCream");
		System.out.println("I love Vanilla");
	}else { 
		System.out.println("I will buy chips");
		System.out.println("Chips makes you fat");
	}
	
	System.out.println("......................................");
	
	double dC=20;
	double dC2=15;
	
	if (dC>dC2) {
		System.out.println("Double Value "+dC+" is larger than "+dC2+".");
		
	}else {
		System.out.println("Value is smaller");
	}
	
	
	System.out.println(".........................................");
	
	boolean hungry=false;
	
	if(hungry) {
		System.out.println("I will go eat");
	}else {
		System.out.println("I will continue study");
		
	}
	
	System.out.println("......................................");
	
	boolean rain=false;
	
	if (rain) {
		
		System.out.println("I will wear a raincoat");
	}else {
		System.out.println("I will wear short");
	}
	
}
	
}
