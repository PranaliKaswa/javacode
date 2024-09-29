package basics;

import java.util.Arrays;

public class ArrysProblem_equals {
	
	public static void main(String[] args) {
		
		String name1[] = new String[5];
	    name1[0] = "Pranali";
	    name1[1] = "Sakshi";
	    
	    String name2[] = new String[5];
	    name2[0] = "Pranali";
	    name2[1] = "Sakshi";
	   
		
		int roll_no1[] = new int[5];
		roll_no1[0] = 101;
		roll_no1[1] = 102;
		
		int roll_no2[] = new int[5];
		roll_no2[0] = 101;
		roll_no2[1] = 102;
		
		char division1[] = new char[5];
		division1[0] = 'A';
		division1[1] = 'B';
		
		char division2[] = new char[5];
		division2[0] = 'A';
		division2[1] = 'B';
		System.out.println(Arrays.equals(roll_no1, roll_no2));

		System.out.println(Arrays.equals(division1, division2));
		
		System.out.println(Arrays.equals(name1, name2));
	}

}
