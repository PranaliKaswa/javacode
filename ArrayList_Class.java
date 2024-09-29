package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Class {

	
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add("Pranali");
		a1.add(100);
		a1.add(null);
		a1.add(null);
		a1.add(100);
		System.out.println(a1);
		
		System.out.println(a1.size());
		System.out.println(a1.get(3));
		a1.set(2, 1000);
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(200);
		a2.add(1);
		a2.add(500);
		a2.add(940);
		a2.addAll(a1);
		
		System.out.println(a2.contains(940));
		System.out.println(a2.indexOf(500));
		
		System.out.println(a2);
		Collections.sort(a2);
		System.out.println(a2);
		
		System.out.println(a2.remove(1));
		System.out.println(a2);
		
		System.out.println("Using Iterator");
		Iterator i1 = a2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Using ListIterator");
		ListIterator li = a2.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}
}
