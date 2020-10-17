package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {

		
	String name="Ahmad";
	
	// I would like to say my name is Ahmad
	
	
	System.out.println("My name is "+name);
	
	String lastName="Fazly";
	
	// I would like to print both Ahmad Fazly (Value of two variables together)
	
	
	System.out.println(name+" "+lastName);

	String city="Virginia";
	// Ahmad lives in Virgina
	System.out.println(name+" Lives in "+city);
	
	int age=34; 
	System.out.println(name+" is "+age+" years old and is a Student");
	
	char grade='A';
	// Ahmad is A Student
	
	System.out.println(name+" is "+grade+" Student & lives in "+city);
	
	/*to attach/concatenate any value (char, int, string, double to 
	a string we use + (String concatenation operator)
	*/
	
	int date=27;
	String month="October";
	System.out.println(date+" "+month);
	
	String state="DC";
	String anotherState=" DC";
	
	System.out.println(state);
	System.out.println(anotherState);
			
	
	}

}
