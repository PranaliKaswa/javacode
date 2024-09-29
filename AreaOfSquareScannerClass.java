package basics;

import java.util.Scanner;


public class AreaOfSquareScannerClass {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of side");
		 int a = sc.nextInt();
		 
		 int areaofsquare = a*a;
		 int circumferenceofsquare = 4*a;
		 
		 System.out.println("Area of square is : " +areaofsquare);
		 System.out.println("Area of square is : " +circumferenceofsquare);
		 
		 
		 
		 
		 
	}

}
