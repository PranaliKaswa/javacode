package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorMethod 

{
	
	
	public static void main(String[] args)
	
	{
		List li = new ArrayList(); //upcasting

			li.add(null); //accept null values
			li.add("Pranali"); // list is heterogenous
			li.add(100);
			li.add(89.346);
			li.add('A');
			li.add(100); //accepts duplicates
			
			Iterator i1 = li.iterator();
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			
	}
}
			


