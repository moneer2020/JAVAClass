package JavaClass07;

public class whileLoopsTask {

	public static void main(String[] args) {

		boolean workDay=true;
		int day =0;
		
		while (workDay) {
			
			if (day>=6) {
				System.out.println("I need a dayoff");

			} else
			System.out.println("Its weekend and I am off");
			day++;

		}


	}

}