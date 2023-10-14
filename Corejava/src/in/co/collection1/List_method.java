package in.co.collection1;

import java.util.LinkedList;
import java.util.*;

public class List_method {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add("sagar");
		l.add(10);
		l.add("sr");
		System.out.println(l);
		
		l.add(1, 20);
		System.out.println(l);
		
//		System.out.println(l.get(1));
//		
//		l.remove(1);
//		System.out.println(l);
//		
//		System.out.println(l.getFirst());
//		
//		System.out.println(l.getLast());
		
		System.out.println("index postion "+l.indexOf("sr"));
		l.set(2, 555);
		System.out.println(l);
		
		System.out.println(l.lastIndexOf("sr"));
		
		
		System.out.println(l.subList(0, 2));
		
		System.out.println(l.subList(0, 4));
		
		System.out.println(l.lastIndexOf(555));
		
		 
	}

}
