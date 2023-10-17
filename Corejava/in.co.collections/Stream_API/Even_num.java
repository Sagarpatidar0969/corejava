package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Even_num {

	public static void main(String[] args) {

			ArrayList<Integer>l = new ArrayList<Integer>();
			l.add(100);
			l.add(47);
			l.add(86);
			l.add(93);
			l.add(23);
			l.add(111);
			l.add(56);
			l.add(222);
			l.add(20);
			l.add(40);
			System.out.println(l);
			
			//without using API
			
			List<Integer>evenlist = new ArrayList<Integer>();
			for (Integer i: evenlist) {
				if(i % 2 == 0) {
					evenlist.add(i);
				}
				
			}
			System.out.println(evenlist);
			
			
			Stream<Integer>s = l.stream();
			List<Integer>l1 = s.filter(e -> e % 2 == 0).collect(Collectors.toList());
			System.out.println(l1);
			
			
			
			Stream<Integer>s2 = l.stream();
			List<Integer>l2 = s2.filter(p -> p > 50).collect(Collectors.toList());
			System.out.println(l2);
			
			
			
	}

}
