package basics;

import java.util.Scanner;

public class ArithmaticOperationsUsingSwitchCase_ScannerClass{
	
	public static void main(String[] args) {
	
	String operators;
	double a, b, result;
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Choose an opearor: +,-,/,%,*");
    operators = sc.next(); 
    
    System.out.println("Enter a");
    a = sc.nextDouble();
    System.out.println("Enter b");
    b = sc.nextDouble();
    
	
	switch(operators)
	{
	case "+":
		result = a+b;
		System.out.println("Addition of two number is : " + result);
		break;
		
	case "-":
		result = a-b;
		System.out.println("Subtraction of two number is : " + result);
		break;
		
	case "/":
		result = a/b;
		System.out.println("Division of two number is : " + result);
		break;
		
	case "%":
		result = a%b;
		System.out.println("Modulus of two number is : " + result);
		break;
		
	case "*":
		result = a*b;
		System.out.println("Multipication of two number is : " + result);
		break;
		
	default:
		System.out.println("Invalid Operation");
	}
	}
	
}

	
