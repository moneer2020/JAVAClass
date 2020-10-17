package com.syntax.class02;

public class ArikthemeticOperators {

	public static void main(String[] args) {

		
		// Arithmetic Operators: +, -, *, /, %
		int num1, num2;
		
		num1=10;
		num2=12;
		
		System.out.println(num1+num2);
		System.out.println(num2-num1);
		
		int res =10+10*10;
		System.out.println(res);
		int res1 =(10+10)*11;
		System.out.println(res1);
		
		double num3=10.99;
		double num4=2.99;
		double num5=15.00;
		double num6=25.99;
		
		
		double mult=num3*num4;
		System.out.println(mult);
		
		double minus=num3-num4;
		System.out.println(minus);
		
		double plus=num3+num4;
		System.out.println(plus);
		
		double result=num4+num5+num6;
		System.out.println(result);
		
		float f=10.99f;
		float f1=2.99f;
		System.out.println(f/f1);
		
		float devi=f/f1;
		System.out.println("The result of devition = " +devi);
		
		int a=12;
		int b=4;
		
		int re=a/b;
		System.out.println("Division of 2 int values = "+re);
		System.out.println("Remainder = "+a%b);
	}

}
