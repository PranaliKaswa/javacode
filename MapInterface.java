package basics;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("Pranali", 101);
		m1.put("Sakshi", 90);
		m1.put("Jay", 87);
		m1.put("Vaishnavi", 99);
		System.out.println(m1);
		
		System.out.println(m1.putIfAbsent("Jay",78));
		m1.replace("Jay", 78);
		System.out.println("==============");
		System.out.println(m1);
		
		System.out.println(m1.containsKey("Jay"));
		System.out.println(m1.containsValue(80));

		
		
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		m2.put("ABC", 109 );
		m2.put("XYZ", 102);
		m2.put("DEF", 78);
		m2.put("HIJ", 678);
		System.out.println(m2);
		m2.putAll(m1);
		System.out.println(m2);
		System.out.println(m2.size());
		System.out.println(m2.putIfAbsent("Mrunal",701));
	
		System.out.println(m2);
		System.out.println("After using putIfAbsent");
		System.out.println(m2.putIfAbsent("Jay",87));
		m1.clear();
		System.out.println(m1);

		System.out.println(m1.isEmpty());
		
		
	}
	

}
