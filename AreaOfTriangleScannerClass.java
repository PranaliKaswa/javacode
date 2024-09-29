package basics;

import java.util.Scanner;


public class AreaOfTriangleScannerClass {
	
	static double a = 0.5;
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of height");
		 double h = sc.nextDouble();
		 
		 
		 AreaOfTriangleScannerClass a1 = new AreaOfTriangleScannerClass();
		 double areaoftriangle = a*h*h;
		 //System.out.println(a1.a);
		 
		 
		 System.out.println("Area of triangle is : " +areaoftriangle);
		 sc.close();
		 
		 
		 
		 
	}

}
