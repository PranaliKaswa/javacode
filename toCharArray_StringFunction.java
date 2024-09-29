package basics;

import java.util.Arrays;

public class toCharArray_StringFunction 
{

	public static void main(String[] args) 
	{
		String name = "pranali";
		
         
		char c1[] =    name.toCharArray();
		
	    System.out.println(Arrays.toString(c1 ));
	    
	    Arrays.sort(c1);
	    System.out.println(Arrays.toString(c1));
	}
	

}
