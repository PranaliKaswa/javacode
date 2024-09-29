package basics;

public class ThisCallingStatement {

	
	
	
	ThisCallingStatement(int a)
	{
		this("Pranali");
		System.out.println("2");
		
	}
	ThisCallingStatement()
	{
		
		System.out.println("1");
		
	}
	
	public static void main(String[] args) {
		
		
		ThisCallingStatement c1 = new ThisCallingStatement(100);
		
	}
	
	ThisCallingStatement(String a)
	{
		this();
		System.out.println("3");
	}
}
