package basics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetInterface {
	
	public static void main(String[] args) {
		
		Set s1 = new HashSet();
		s1.add(43);//doesnot follow indexing
		s1.add("pranali");//accepts heterogenous values
		s1.add(43); //does not accepts duplicates
		s1.add(null); //sccepts null
		System.out.println(s1);
		
		
		Iterator i1 = s1.iterator(); //we can iterate SET using Iterator
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		Set s2 = new HashSet();
		s2.add(76);
		s2.add(456);
		s2.add(90);
		
		//Collections.sort((List<T>) s2);
	}

}
