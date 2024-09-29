package basics;

import java.util.Arrays;

public class ArrayProblem_Anagram {

	public static void main(String[] args) {
		
		String name1 = "arm";
		String name2 = "ram";
		
		char n1[] = name1.toCharArray();
		char n2[] = name2.toCharArray();
		           Arrays.sort(n1);
		           Arrays.sort(n2);
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
	    boolean b1 = Arrays.equals(n1, n2);
	    System.out.println(b1);
		if(b1==true)
		{
			System.out.println("This is anagram");
		}
		else {
			System.out.println("This is not anagram");
		}
	}

}
