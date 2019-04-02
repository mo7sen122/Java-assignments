package assignment2;
import java.util.Scanner;

public class Calculation {

	public void calculator() {
		
	double first_Number , second_Number;
	
	String operator="";
	
	System.out.print("Please enter your first number ");
	
	Scanner f_Num = new Scanner(System.in); //Read first number 
	
	first_Number = f_Num.nextDouble();
	
	System.out.print("Please enter your Second number ");
	
	Scanner s_Num = new Scanner(System.in); //Read Second  number 
	
	second_Number = s_Num.nextDouble();
	
	System.out.print("Please enter your operator ");
	
	Scanner op = new Scanner(System.in);
	
	operator = op.nextLine();
	
	switch(operator) {
	
	case "+":
		//add 
		System.out.print("The Submission of those number should be : ");
		System.out.println(first_Number + second_Number);
		break;
		//subtract
	case "-":
		System.out.print("The Submission of those number should be : ");
		System.out.println(first_Number - second_Number);
		break;
		
	case "%":
		
		System.out.print("Result of those number should be : ");
		System.out.println(first_Number % second_Number);
		break;
	
	default:
		System.out.println("Sorry you should enter  +,- or %");
		
}
	}
}
