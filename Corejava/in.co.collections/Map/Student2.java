package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Student2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the course ");
		System.out.println("enter the course fees");
		int fee = 1500;
		String course;
		
		HashMap<String,Integer>hm = new HashMap<>();
		HashMap<String,Integer>hm2 = new HashMap<>();
		
		hm.put(sc.next(), sc.nextInt());
		hm.put(sc.next(), sc.nextInt());
		hm.put(sc.next(), sc.nextInt());
		
		
		Set<Entry<String,Integer>>set = hm.entrySet();
		
		
		for(Entry<String,Integer>map:set) {
			String s = map.getKey();
			Integer i = map.getValue();
			
			if(i>fee) {
				course = "You are  Special";
				hm2.put(course, i);
			}
			else {
				course = "you are not special";
				hm2.put(course, i);
			}
		}
		  
		
		Set<Entry<String,Integer>>set1 = hm2.entrySet();
		for(Entry<String,Integer>map1:set1) {
			String s1 = map1.getKey();
			Integer i1 = map1.getValue();
			System.out.println(s1+ " " + i1);
			
		}
	}

}
