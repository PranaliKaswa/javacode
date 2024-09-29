package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface_Iteration {
	
public static void main(String[] args) {
		
		Map<String,Character> m1 = new HashMap<String,Character>();
		m1.put("Pranali", 'A');
		m1.put("Sakshi", 'B');
		m1.put("Jay",'C');
		m1.put("Vaishnavi", 'D');
		System.out.println(m1);
		
		System.out.println("Using for each loop");
		for(String s1 : m1.keySet())
		{
			System.out.println(s1);
		}
		for(Character s2 : m1.values())
		{
			System.out.println(s2);
		}
		
		System.out.println("Using entrySet method");
		for(Entry<String,Character> s3 : m1.entrySet())
		{
			System.out.println(s3);
		}
		
		System.out.println("Using Iterator");
		
		Set<Entry<String,Character>> e1 = m1.entrySet();
		Iterator <Entry<String,Character>> i1 = e1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
}

}
	