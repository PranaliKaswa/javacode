package basics;

import java.util.Arrays;

public class StringFunction {
	
	public static void main(String[] args) {
		
		
		String name = "Pranali";
				
		System.out.println(name.substring(2,6));
		
		
		int size = name.length();
		System.out.println(size);

		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		
		String a = "My name is Pranali";
		System.out.println(a);
		System.out.println(a.trim());
		
		String a1 = " My name is Pranali";
		System.out.println(a1.substring(3));
		
		System.out.println(a1.substring(2, 5));
		
		
		System.out.println(a1.equals(a));
		System.out.println(a1.equalsIgnoreCase(name));
		
        System.out.println(name.concat(a1));
        
        String z1 = "ABC";
      String z2 = z1.concat(" ").concat("Kaswa");
      System.out.println(z2);
        
        String s1 = "Sakshi";
        String s2 = "Kaswa";
        
        String s3 = s1.replace('k', 's');
		System.out.println(s3);
		
		System.out.println(s2.replaceAll("Kaswa", "kaswa"));
		
		String s4 = "kn no 2 banglore";
		System.out.println(s4.replaceAll("[a-z]", ""));
		
		String s5 = "50 cent";
		System.out.println(s5.replaceAll("[0-9]", ""));
		
		String s6 = "Pranali Kaswa";
		System.out.println(s6.replaceAll("[A-Z]", ""));
		
		String s7 ="My name is Pranali Kaswa";
		System.out.println(s7.replaceAll(" ",""));
		
		System.out.println(s7.contains("Kaswa"));
		
		System.out.println(s7.matches("(.*)a")); //multisearch from end
		
		System.out.println(s7.matches("M(.*)"));//multisearch from start 
		
		String s8 = "Pranali";
		System.out.println(s8.matches("(.*)a(.*)"));
		
		System.out.println(s8.matches("......"));
		
		System.out.println(s8.charAt(5));
		
		System.out.println(s8.indexOf('l'));
		   
		char c1[] = s8.toCharArray(); //tocharArray
		System.out.println(Arrays.toString(c1));
		
		
		//String name2 = "My name is Pranali Kaswa";
		//System.out.print(name2.repeat(10));
		
	      // String c2[] = name2.split(" ");
		//System.out.println(Arrays.toString(c2));
		

		String name3 = "My name is Sakshi Kaswa";
		System.out.print(name3.repeat(2));
		
	       String c3[] = name3.split(" ", 3);
		System.out.println(Arrays.toString(c3));
	}

}
