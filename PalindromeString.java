package basics;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		
		String input = "madam";
        System.out.println("My String is - " +input);
        
        String output = "";
        for(int i = input.length()-1;i>=0;i--)
        {
        	char c1 = input.charAt(i);
        	output = output+c1;
        	
        }
        
        System.out.println("The reverse String is - "+output);
	
	
	if(input.equals(output)==true)
	{
		System.out.println("It is a Palindrome");
	}
	else
	{
		System.out.println("It is not a Palindrome");
	}

}
}
