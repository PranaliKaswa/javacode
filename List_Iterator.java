package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator 

{
	
	
	public static void main(String[] args)
	
	{
		List li = new ArrayList(); //upcasting

			li.add(null); 
			li.add("Pranali"); 
			li.add(100);
			li.add(89.346);
			li.add('A');
			li.add(100); 
			
			Iterator i1 = li.iterator();
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			
			}
			System.out.println("Using List Interface");
			
			
			ListIterator i2 = li.listIterator();
			while(i2.hasNext())	
			{
				System.out.println(i2.next());
			}
			
			while(i2.hasPrevious())
			{
				System.out.println(i2.previous());
			}
			}	

			}
		
			
			


	
						
						
	


				
				
