package basics;

import java.util.InputMismatchException;
public class throw_throws_keyword {
	
	public static void main(String[] args) throws NullPointerException, InputMismatchException //throws keyword
	{
		
		if(11==1)
		{
	//throw new NullPointerException();
	throw new NullPointerException("Sorry your cell is empty");	// throw keyword
	}
		else {
			throw new InputMismatchException("Sorry check your input");	// throw keyword

		}
	}
}
