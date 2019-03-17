package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double first_Number , second_Number, result; 
		
		System.out.println("Hello, you can perform your basic mathematical operations here ");
		
		System.out.print("Please enter your first number: ");
		
		Scanner f_Num = new Scanner(System.in); //Read first number 
		
		first_Number = f_Num.nextDouble();
		
		System.out.print("Please enter your second number: ");
		
		Scanner s_Num = new Scanner(System.in); //Read Second  number 
		
		second_Number = s_Num.nextDouble();
		
		//add 
		result = first_Number + second_Number; 
		
		System.out.println("The Submission of those number should be : " + result);
		
		//subtract
		result = first_Number - second_Number; 
		
		System.out.println("The Subtraction of those number should be : " + result);
		
		//multiplication
		result = first_Number * second_Number; 
		
		System.out.println("The Multiplication of those number should be : " + result);
		
		//Subdivision
		result = first_Number / second_Number; 
		
		System.out.print("The Subdivision of those number should be : " + result);
		
		f_Num.close(); //Close scanner 
		
		s_Num.close(); //Close scanner
	}

}
