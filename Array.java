package basics;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int roll_no[] = new int[3];
		roll_no[0] = 101;
		roll_no[1] = 102;
		roll_no[2] = 103;
		
		String name[] = new String[3];
		name[0] = "Pranali";
		name[1] = "Sakshi";
		name[2] = "Jay";
		
		char division[] = new char[3];
		division[0] = 'A';
		division[1] = 'B';
		division[2] = 'A';

		
		Boolean pass[] = new Boolean[3];
		pass[0] = true;
		pass[1] = false;
		pass[2] = true;

        double percentage[] = new double[3];
        percentage[0] = 99.9;
        percentage[1] = 34.9;
        percentage[1] = 89.9;
        
        

		
		
		for(int i=0;i<3;i++)
		{
			System.out.println("The name of student is - " +name[i] + "Roll no is -" + roll_no[i] + "Division - " +division[i] + " Percentage - " +percentage[i] + "Pass/Fail - " + pass[i]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(roll_no));
		System.out.println(Arrays.toString(division));
		System.out.println(Arrays.toString(pass));
		System.out.println(Arrays.toString(percentage));


		
	}
}
