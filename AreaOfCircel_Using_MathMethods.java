package basics;
import java.lang.*;


public class AreaOfCircel_Using_MathMethods {
	
	
	static double pi = Math.PI ; 
public static void main(String[] args) {
	
	
	for (int i=0; i<10; i++)
	{
		double r= Math.random();
		
		System.out.println("The value of r is ->" +r);
	    double area = pi*r*r;
	
	    System.out.println("Area of circle is -> "+area);
	}

	}

}
