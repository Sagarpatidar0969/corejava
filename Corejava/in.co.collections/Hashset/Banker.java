package Hashset;

import java.util.HashSet;

public class Banker {
	public static void main(String[] args) {
		HashSet<Integer>hset = new HashSet<Integer>();
		hset.add(109);
		hset.add(110);
		hset.add(100);
		hset.add(100);
		hset.add(109);
		System.out.println(hset);
		
	}

}
