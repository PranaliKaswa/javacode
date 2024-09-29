package basics;

import java.util.Arrays;

public class ArrayProblem_CopyArray1ToArray2_UsingIteration {

	public static void main(String[] args) {
		
		int rollno1[] = new int[2];
		rollno1[0] = 34;
		rollno1[1] = 38;
		
		int rollno2[] = new int[2];
		

		
		for(int i=0;i<2;i++)
		{
			rollno2[i] = rollno1[i]; //we always assign the values from right hand to left hand in java
		}
		
		
		System.out.println(Arrays.toString(rollno1));
		System.out.println(Arrays.toString(rollno2));
	}
	
	

}