package basics;

import java.util.Scanner;


public class AreaOfCircleUsingScannerClass {
	final static double pi = 3.14;
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of radius");
		 
		 double r = sc.nextDouble();
		 double areaofcircle = pi*r*r;
		 double circumferenceofcircle = 2*pi*r;
		 
		 System.out.println("Area of circle is : " +areaofcircle);
		 System.out.println("C2ircumference of circle is : " +circumferenceofcircle);
		 
		 
		 
		 
		 
	}

}
