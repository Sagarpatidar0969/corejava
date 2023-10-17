package in.com.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Testemp {
	public static void main(String[] args) {
		ArrayList<Employee1> e = new ArrayList<Employee1>();
		
		e.add(new Employee1(1, "ram", "43578"));
		e.add(new Employee1(4, "rahul", "2343"));
		e.add(new Employee1(6, "dilip", "354232"));
		e.add(new Employee1(2, "lavish", "t54353"));
		e.add(new Employee1(8, "sr"," 949493"));
		
		System.out.println(e);
		
		Collections.sort(e);
		System.out.println(e);
		
		Iterator<Employee1> it = e.iterator();
		
		while(it.hasNext()) {
			Employee1 emp = it.next();
			System.out.println(emp);
		}
		
		
		
	}

}
