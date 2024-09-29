package basics;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationInteface_LegacyClasses {
	
	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		s1.add(700);
		s1.add(800);
		s1.add(null);
		s1.add("Pranali");
		System.out.println(s1);
		
		Enumeration e1 = s1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
