package firstClassPractice;

public class DataTypeAndVariables {


	public static void main(String[] args) {

		//Permitive Datatypes
		//Numeric Data
		
		//type name =assign value
		byte var1=4; //-128 to 127
		short var2=100; // -32768 to 32768
		int var3=10000; // 
		long var4=1000000L;
		float var5= 2.55f;
		double var6= 12.9999;
		
		//Non Numeric Data
		char ch= 'M';
		char ch1='7';
		char ch2='&';
		boolean b=true; 
		boolean b1=false;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(b);
		System.out.println(b1);
		
		int myBox;
		myBox=135;
		myBox=155;
		System.out.println(myBox);

		int num1, num2, num3, num4;
		num1=10;
		num2=20;
		num3=30;
		num4=40;
		System.out.println(num1+num2+num3+num4);
				
		char char1='C';
		char char2=char1;
		System.out.println(char2);
	}

}
