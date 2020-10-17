package revJavaClass2;

import java.util.Scanner;

public class DebugScannerIfStatement {

	public static void main(String[] args) {

		Scanner userin = new Scanner(System.in);
		System.out.println("Please enter your gender:M or F");
		char gender = userin.next().charAt(0);
		System.out.println("Please enter your age");
		int age = userin.nextInt();
		if (gender == 'M') {
			if (age >25) {
				System.out.println("Man");
			}else {
				System.out.println("Boy");
			}
		}
		
		if (gender == 'F') {
			if (age <25) {
				System.out.println("Girl");
			}else {
				System.out.println("Woman");
			}
		}
	}

}
