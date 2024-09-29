package basics;

public class NotLogicalOperator {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(!(a==10 && b==20))
		{
			System.out.println("Execute");
		}
		if(!(a==100 || b==80))
		{
			System.out.println("Executing");
		}
		if(!(a>1))
		{
			System.out.println("Hello");
		}
	}

}
