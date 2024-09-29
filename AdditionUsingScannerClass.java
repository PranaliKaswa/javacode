package basics;

import java.util.Scanner;

public class AdditionUsingScannerClass {
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a :");
		
		int a = s1.nextInt();	
		System.out.print("Enter b :");
		
		
		int b = s1.nextInt();		
		int sum = a+b;
		
		System.out.print("Addition of two number :" +sum);
	}

}
