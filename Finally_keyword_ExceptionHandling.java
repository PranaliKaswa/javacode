package basics;

public class Finally_keyword_ExceptionHandling {

	public static void main(String[] args) {
		 
		
		try {
			int a = 1/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println("Exception is handled");
		}
		
		finally
		{
			System.out.println("Welcome");
		}
	}
}
