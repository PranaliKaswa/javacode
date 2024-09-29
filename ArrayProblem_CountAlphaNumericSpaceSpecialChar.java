package basics;

public class ArrayProblem_CountAlphaNumericSpaceSpecialChar {
	
	public static void main(String[] args) {
		
		int count_of_alphabets = 0;
		int count_of_digit = 0;
		int count_of_space = 0;
		int count_of_specialchar = 0;
		
		
		String a = "P!ranali Kaswa 101010@101 ";
		char c1[] = a.toCharArray();
		
		for(int i=0; i<a.length(); i++)
		{
			boolean b1 = Character.isLetter(c1[i]);
			if(b1==true)
			{
				count_of_alphabets++;
			}
		}
			System.out.println("The number of alphabets are : "+count_of_alphabets);

		
	for(int i=0; i<a.length(); i++)
	{
		boolean b2 = Character.isDigit(c1[i]);
		if(b2==true)
		{
			count_of_digit++;
		}
	}
		System.out.println("The number of alphabets are : "+count_of_digit);
		
		
		for(int i=0; i<a.length(); i++)
		{
			boolean b3 = Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}
			System.out.println("The number of spaces are : "+count_of_space);
			
			
	
	
	
		count_of_specialchar = a.length() - (count_of_space + count_of_digit + count_of_alphabets);
		
	
	   System.out.println("The number of special char are : "+count_of_specialchar);
	}
}
	
	
	
	
		
	

        
	
		

