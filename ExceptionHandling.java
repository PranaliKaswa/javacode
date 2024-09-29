package basics;

public class ExceptionHandling {
	static void div()
	{
	try {
	int a = 1/0;
	System.out.println(a);
	}
	catch(ArithmeticException a)
	{
		System.out.println("sorry there was exception");
		int b = 1/1;
		System.out.println(b);
	}
	
	}
	
	public static void main(String[] args) {
		div();
	}


}
