package basics;

public class Constructor {
	
	
	Constructor() // Constructor
	{
		System.out.println("This is a Constructor");
	}
	
	
	
	Constructor(int a) //Parameterized Constructor
	{
		System.out.println("This is para constructor");
	}
	
	Constructor(char b)
	{
		System.out.println("this is non static");
	}
	public static void main(String[] args) {
		
		new Constructor();
		new Constructor(10);
		//Constructor n1 = new Constructor();
		new Constructor('A');
		
		
	}
	
	
}
