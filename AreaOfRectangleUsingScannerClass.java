package basics;

import java.util.Scanner;


public class AreaOfRectangleUsingScannerClass {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of length");
		 double l = sc.nextDouble();
		 
		 System.out.println("Enter the value of breadth");
		 double b = sc.nextDouble();
		 
		 double areaofrectangle = l*b;
		 double circumferenceofrectangle = 2*l+2*b;
		 
		 System.out.println("Area of rectangle is : " +areaofrectangle);
		 System.out.println("Area of rectangle is : " +circumferenceofrectangle);
		 sc.close();
		 
		 
		 
		 
	}

}
