package map_collections;

import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class TreeMapDemo {
	public static void main(String[] args) {
//	    TreeMap tm = new TreeMap();
//		tm.put(1, "Hello");
//		tm.put(10, 9);
//		tm.put(1, 'c');
//		System.out.println(tm);
//		
//		TreeMap tm1= new TreeMap((o1,o2)->(Integer)o2-(Integer)o1);//Sorts in descending order
//		tm1.put(1, "Hello");
//		tm1.put(10, null);
//		tm1.put(1, 'c');
//		tm1.put(2, 40);
//		System.out.println(tm1);
		
		TreeMap<String,List<String>> map = new TreeMap<>();
		List<String> l1 = Arrays.asList("Hyd","Kol","Mum");
		List<String> l2 = Arrays.asList("Del","Chen","J&K");
		List<String> l3 = Arrays.asList("Ass","Pun","Mum");
		
		map.put("SBI", l1);
		map.put("ICICI", l2);
		map.put("PNB", l3);
		
		System.out.println(map);
		Set<String> s =map.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collection<List<String>> c = map.values();
		Iterator<List<String>> itr1 = c.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Set<Entry<String,List<String>>> s1 = map.entrySet();
		Iterator<Entry<String,List<String>>> itr2 = s1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		for(Entry<String,List<String>> e : s1) {
			System.out.println(e.getKey()+"---->"+e.getValue());
		}
	
		
//		System.out.println(tm1.containsKey(5));
//		System.out.println(tm1.containsKey(1));
//		
//		System.out.println(tm1.containsValue("Hello"));
//		System.out.println(tm1.containsValue(null));
//		
//		System.out.println(tm1.replace(1, "sd"));
//		System.out.println(tm1.replace(10, null, 20));
//		System.out.println(tm1);
//		
//		System.out.println(tm1.ceilingKey(2));
//		System.out.println(tm1.ceilingKey(10));
		
		
	}
}
