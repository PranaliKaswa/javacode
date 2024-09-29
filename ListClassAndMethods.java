package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListClassAndMethods {
	
	
	public static void main(String[] args) {
		
		
		List li = new ArrayList(); //upcasting
		{
			li.add(null); //accept null values
			li.add("Pranali"); // list is heterogenous
			li.add(100);
			li.add(89.346);
			li.add('A');
			li.add(100); //accepts duplicates
			
			
			System.out.println(li.size());
			System.out.println(li);
			
			
			System.out.println(li.contains(100)); //contains
			
		
			
			
			
			
		}
		
		List li1 = new ArrayList();
		{
			li1.add("man");
		    li1.add("woman");
		    li1.addAll(li);
			System.out.println(li1);
			
			li1.removeAll(li)	; // removeAll
			System.out.println("After removeAll method : - " +li1);
			

		}
		
		List l2 = new ArrayList();
		{
			l2.add("Pranali");
			l2.add("Prashant");
			l2.add("PrashantA");
			
			
			
			System.out.println("Before Sorting - " +l2);
			
			Collections.sort(l2);
			System.out.println("After Sorting - " +l2);
			
			System.out.println(li.get(2));
			
			System.out.println(l2.equals(li1));
			
			List l3 = new ArrayList();
			l3.add(433);
			l3.add("manish");
			l3.add(9);
			l3.add(null);
			l3.add(790);
			l3.add(790);
			System.out.println(l3);
			
			l3.remove(2);
			System.out.println(l3);
			
			l3.remove(null);
			System.out.println(l3);
			
			
			List l4 = new ArrayList();
			l4.add(457);
			l4.add(890);
			l4.add("pranali");
			System.out.println(l4);
			
			l4.clear();
		    System.out.println(l4);

		    System.out.println(l4.isEmpty());			
		    
		    
		    
		    List l5 = new ArrayList();
		    l5.add(400);
		    
		    List l6 = new ArrayList();
		    l6.add(876);
		    l6.add("name");
		    l6.addAll(l5);
		    System.out.println(l6);
		    System.out.println(l6.containsAll(l5)); //containsAll
		
		    
		    List l7 = new ArrayList();
		    l7.add(900);
		    l7.add(76);
		    l7.add(90);
		    l7.add(null);
		    l7.add("pranali");
		    System.out.println(l7);
		    System.out.println(l7.get(4)); //get method
		    System.out.println(l7.set(2, "sakshi"));
		    System.out.println(l7); //set method
		    System.out.println(l7.size());
		    System.out.println(l7.indexOf(null));//indexOf method
		}
		
		
	}

}
