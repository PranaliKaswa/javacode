package basics;

public class Assignment_9 {
	
	
	static void add() //static non parameterized
	{
		int a = 1;
		int b = 5;
		System.out.println(a+b);
	}
	
	static void multiply(float f1, float f2) //static parameterized method
	{
		float c = f1*f2;
		System.out.println(c);
		
	}
	

	static void div() //static non parameterized
	{
		float a = 3.4f;
		float b = 34.34f;
		System.out.println(a/b);
	}
	
	
	void compare()//non-static non parameterized
	{
	    int a = 24;
	    int b = 78;
	    if(a<b)
	    	System.out.println("a is less than b");
	    else
	    	System.out.println("a is greater than b");
	}
	
	void compare(int a , int b)//non-static parameterized
	{
	    if(a<b)
	    	System.out.println("a is less than b");
	    else
	    	System.out.println("a is greater than b");
	}
	
	void sub() // non-static non parameterized
	{
		int a = 58;
		int b = 50;
		System.out.println(a-b);
	}
	
	void sub1(float a, float b) // non-static non parameterized
	{
		System.out.println(a-b);
	}
	Assignment_9() // Constructor
	{
		System.out.println("This is non para constructor");
	}
	
	Assignment_9(int a) // Constructor
	{
		System.out.println("This is para constructor");
	}
	
	Assignment_9(int a, int b) // Constructor
	{
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		
		add();
		multiply(3.4f, 4.5f);
		div();
		Assignment_9 n1 = new Assignment_9();
		n1.compare();
		n1.compare(76788,4763);
		n1.sub();
		n1.sub1(56.0f,50.0f);
		new Assignment_9();
		new Assignment_9(9);
		new Assignment_9(9,18);
	}
}
