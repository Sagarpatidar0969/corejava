package Hashset;

import java.util.Comparator;

public class Sortname implements Comparator<Bankers>{

	@Override
	public int compare(Bankers o1, Bankers o2) {
		
		return o1.name.compareTo(o2.name);
	}
	

}
