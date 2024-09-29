package basics;

public class FinalVariable {

	final double pi = 3.14;
	void areaofcircle()
	{
		int r = 10;
		double a1 = pi*r*r;
		System.out.println(a1);
	}
	
	
	public static void main(String[] args) {
		final int month_in_year = 12; // final variable
		//month_in_year = 15; // cannot change final variable
		System.out.println(month_in_year);
		
		FinalVariable area1 = new FinalVariable();
		area1.areaofcircle();
	}
}
