package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FinderAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age.......");
		System.out.println("enter the name......");
		int ages = 18;
		String name;
		
		HashMap<Integer, String> hm = new HashMap<>();
		HashMap<String, String>hm2 = new HashMap<>();
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		hm.put(sc.nextInt(), sc.next());
		
		Set<Entry<Integer,String>>set = hm.entrySet();
		
	for(Entry<Integer,String>map:set) {
		Integer i = map.getKey();
		String s = map.getValue();
		if(i>ages) {
			 name = "you are yuva";
			
			hm2.put(s,name );
		}
		else {
			name = "you are smaller";
			hm2.put(s, name);
		}
		
	}
	
	Set<Entry<String,String>>set1 = hm2.entrySet();
	for(Entry<String, String> map1:set1) {
		String s1=map1.getKey();
		String s2=map1.getValue();
		System.out.println(s1+" "+s2);
		
	}
		
	}

}
