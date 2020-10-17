package com.syntax.class02;

import java.util.Scanner;

public class ScannerDeom {

	public static void main(String[] args) {

		
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in); //enable input to the console
		System.out.println("Please enter any text");
		
		String value=scan.nextLine(); //whaits for your input and once you provided input... hit ENTER
		System.out.println("I captured String value = "+value);
		
		System.out.println("Plese enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
	
		
	}

}
