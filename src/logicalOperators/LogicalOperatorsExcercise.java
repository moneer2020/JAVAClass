package logicalOperators;

import java.util.Scanner;

public class LogicalOperatorsExcercise {

	private static final boolean True = false;

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Is there sale");
		
		boolean isSale=True;
		int number=85;
		
		if (!(number>90)) {
			System.out.println("I will buy something");
			
		}else {
			System.out.println("I am staying home");
		
		}
		
		
		
	}

}
