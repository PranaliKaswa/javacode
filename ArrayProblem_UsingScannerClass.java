package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem_UsingScannerClass {
	
	public static void main(String[] args) {
		
		
		Scanner s1 = new Scanner(System.in);
		     
		int student_id[] = new int[2];
		
		for(int i=0;i<2;i++)
		{
			/*System.out.println("The student id is -> " + s1.next());
		    student_id[i] = s1.nextInt();
			System.out.println(Arrays.toString(student_id));
		    System.out.println("The name of student is - " +student_id);
		    */
		    student_id[i] = s1.nextInt();

		}
		System.out.println("The array is -> " +Arrays.toString(student_id));
		
	}

}
