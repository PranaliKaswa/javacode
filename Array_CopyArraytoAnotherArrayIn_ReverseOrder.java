package basics;

import java.util.Arrays;

public class Array_CopyArraytoAnotherArrayIn_ReverseOrder 
{
	public static void main(String[] args)
	{
		
		int array1[] = new int[4];
		array1[0] = 12;
		array1[1] = 345;
		array1[2] = 13;
		array1[3] = 45;
		
		int array2[] = new int[4];
		
		for(int i=0,k=3;i<array1.length; i++)
		{
			array2[k]=array1[i];
			k--;
		}

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		
		
	
	
	
	
	}
}
