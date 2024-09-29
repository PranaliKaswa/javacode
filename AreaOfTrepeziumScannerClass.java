package basics;

import java.util.Scanner;


public class AreaOfTrepeziumScannerClass {
	
	double a = 0.5;
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of length 1");
		 double l1 = sc.nextDouble();
		 
		 System.out.println("Enter the value of length 2");
		 double l2 = sc.nextDouble();
		 
		 System.out.println("Enter the value of heigth");
		 double h = sc.nextDouble();
		 
		 AreaOfTrepeziumScannerClass n1 = new AreaOfTrepeziumScannerClass();
		 //System.out.println(n1.a);
		 double areaoftrepezium = n1.a*(l1+l2)*h;
		 
		 System.out.println("Area of Trepezium is : " +areaoftrepezium);
		 sc.close();
		 
		 
		 
		 
	}


	}


