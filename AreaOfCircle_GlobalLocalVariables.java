package basics;

public class AreaOfCircle_GlobalLocalVariables {
	
	static double pi = 3.14;
	static int a;
	static boolean b;
	void area1()
	{
		int r = 19;
		double a1 = pi*r*r;
		System.out.println(a1);
	}
	
	static void area2()
	{
		int r = 20;
		double a2 = pi*r*r;
		System.out.println(a2);
	}
	
	public static void main(String[] args) {
		
	
		System.out.println(a);
		System.out.println(b);
		//area2();
		AreaOfCircle_GlobalLocalVariables n1 = new AreaOfCircle_GlobalLocalVariables();
		n1.area1();
		area2();
	
		
		

	}

}
