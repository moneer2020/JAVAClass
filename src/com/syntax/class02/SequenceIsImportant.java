package com.syntax.class02;

public class SequenceIsImportant {

	public static void main(String[] args) {

		int score =90;
		boolean assignment=true;
		
		if (assignment) {
			if(score>90) {
				System.out.println("You did great!!!!!");
			}else if (score >80) {
				System.out.println("You did good");
			}else if (score>70) {
				System.out.println("You probably need to study more");
			}else {
				System.out.println("Good job for trying but you must study more");
			}
			
		    }else {
				System.out.println("You should always complete assignment");
				
		}
		
		
	}

}
