package com.syntax.class02;

import java.util.Scanner;

public class scannerDemo2 {

	public static void main(String[] args) {

		boolean b=false;
		
		Scanner input=new Scanner(System.in);
		System.out.println ("Please enter boolean value for rain");
		
		boolean rain=input.nextBoolean();
		
		if(rain) {
			System.out.println("Please take an umberal");
		}else 
			System.out.println("It is a nice weather go for a walk");

	
	
	
	
	}

}
