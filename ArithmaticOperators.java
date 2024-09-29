package basics;

public class ArithmaticOperators {
	
	static void Addition() 
	{
		int a = 10;
		int b = 27;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		Addition();
		sub();
		multi();
		div();
		modulus();
	
	}
	static void sub() 
	{
		int a = 10;
		int b = 27;
		int c = a-b;
		System.out.println(c);
		
	}

	static void multi() 
	{
		int a = 10;
		int b = 27;
		int c = a*b;
		System.out.println(c);
		
	}
	
	static void div() 
	{
		int a = 10;
		int b = 27;
		int c = a/b;
		System.out.println(c);
		
	}
	
	static void modulus() 
	{
		int a = 1;
		int b = 100;
		int c = a%b;
		System.out.println(c);
		
	}
}
