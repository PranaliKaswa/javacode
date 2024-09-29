package basics;

import java.util.Arrays;

public class ArrayProblem_CheckNumberIsPresent {

	
	public static void main(String[] args) {
		
		int[] number = new int[4];
		number[0] = 45;
		number[1] = 48;
		number[2] = 44;
		number[3] = 43;
		
		
		System.out.println(Arrays.toString(number));
		
		int no_to_check = 44;
		for(int i=0; i<4; i++)
		{
			if(no_to_check == number[i])
			{
				System.out.println("The given number " + no_to_check + " is present in the array");
				System.out.println("The index of the given number is " +i);
			}
		
		
		}
			
			
		
	
}
}
