package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

public class Banks_main {
	public static void main(String[] args) {
		HashSet<Bankers>hs = new HashSet<Bankers>();
		Bankers b = new Bankers(109, "sham", 83737282, "indore");
		Bankers b1 = new Bankers(112, "ram", 433237282, "pune");
		Bankers b2= new Bankers(121, "lucky", 839882, "noida");
		Bankers b3 = new Bankers(189, "dev", 23737282, "indore");
		Bankers b4= new Bankers(100, "pappu", 99737282, "ujjain");
		
		hs.add(b);
		hs.add(b1);
		hs.add(b3);
		hs.add(b4);
		System.out.println(hs);
		
		TreeSet<Bankers>tr = new TreeSet<>();
		System.out.println(tr);
		
		Iterator<Bankers>it = tr.iterator();
		while(it.hasNext()) {
			Bankers benk = it.next();
			System.out.println(benk);
			
			TreeSet<Bankers>tr = new TreeSet<>(hs,new );
		}
		
		
	}

}
