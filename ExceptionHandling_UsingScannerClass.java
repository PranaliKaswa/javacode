package basics;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling_UsingScannerClass {

	
	
	public static void main(String[] args) {
	try {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s1.nextInt();
		}
	catch(InputMismatchException a1)
	{
	   System.out.println("Sorry this doesn't seems your age");
	   Scanner s2 = new Scanner(System.in);
		System.out.println("Enter your age again");
		int age1 = s2.nextInt();
		
		
	}
	try {
		Scanner s3 = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = s3.nextInt();
			}
		
	catch(InputMismatchException aa21)
	{
	   System.out.println("Sorry this is not seems your age");
	   Scanner s2 = new Scanner(System.in);
		System.out.println("Enter your age again");
		int age1 = s2.nextInt();
		
	}
	catch(NullPointerException a2)
	{
	   System.out.println("Sorry this  age");
	   Scanner s3 = new Scanner(System.in);
		System.out.println("Enter your age again");
		int age2 = s3.nextInt();
		
		
	}
	}
}
	
