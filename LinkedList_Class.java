package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Class  {

	
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(79);
		li.add(845);
		li.add(43);
		li.add(60);
		System.out.println(li);
		li.addFirst(89);
		System.out.println(li);
		/*li.removeFirst();
		System.out.println(li);
		li.getFirst();
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		li.removeLast();
		System.out.println(li);
		li.pollLast();
		System.out.println(li);*/
		
		
		System.out.println(li.size());
		System.out.println(li.get(3));
		li.set(2, 1000);
		System.out.println(li);
		li.clear();
		System.out.println(li);
		
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Pranali");
		l2.add("Jay");
		l2.add("J");
		
		
		System.out.println(li.contains("J"));
		System.out.println(li.indexOf("Pranali"));
		
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		
		System.out.println(l2.remove(1));
		System.out.println(l2);
		
		System.out.println("Using Iterator");
		Iterator i2 = l2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Using ListIterator");
		ListIterator li1 = l2.listIterator();
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		while(li1.hasPrevious())
		{
			System.out.println(li1.previous());
		}
	}
}

