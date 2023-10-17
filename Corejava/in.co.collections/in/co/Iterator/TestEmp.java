package in.co.Iterator;

import java.util.ArrayList;
import java.util.*;

public class TestEmp {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "sr", "rj");
		Employee e2 = new Employee(2, "patel", "jhalawar");
		//List<Employee>l=new ArrayList<>();
		
		List<Employee> a1 = new ArrayList();
//		ArrayList a1 = new ArrayList();
		a1.add(e1);
		a1.add(e2);
		System.out.println(a1);
		System.out.println("index 0 postion"+ " "+ a1.get(0));
		
		//mathod 1
		Employee e = (Employee) a1.get(0);
		System.out.println(e);//problem create it get hascode so here we use toString method
		System.out.println(e.getAddress());
		
		//mathod 2
		System.out.println("!!!using for loop");
		
		
			for (int i = 0; i <a1.size() ; i++) {
				Employee e4 = (Employee) a1.get(i);
				System.out.println(e4);
				
			}
				 
		//method 3
			for (Object object : a1) {
				Employee e5 = (Employee) object;
				System.out.println(e5);
			}
			
			Iterator<Employee> it = a1.iterator();
			while(it.hasNext()) {
				Employee e6 = it.next();
				a1.add(e6);
				System.out.println(e6);
			}
		
		
		
		
		
		
		
	}

}
