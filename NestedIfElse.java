package basics;

public class NestedIfElse {
	
	public static void main(String[] args) {
		int n = 24;
		
		if(n%7 == 0)
		{
			System.out.print("Even ");
	
		    if(n%6 == 0)
		    {
			System.out.println("and is divisible by 6");
			}
		    else
		    {
			System.out.println(" and is not divisible by 6");
			}
	    }

	else
	{
		System.out.print("Odd ");
	
		if(n%3 == 0)
		{
			System.out.println("and is divisible by 3");
		}
		else
		{
			System.out.println("and is not divisible by 3");
		}
    }
}
}

