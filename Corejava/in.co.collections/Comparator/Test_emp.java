package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test_emp {
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2, "sagar", "678"));
		emp.add(new Employee(1, "sr", "2421"));
		emp.add(new Employee(5, "dilip", "34532"));
		emp.add(new Employee(3, "ram", "78457"));
		
		//System.out.println(emp);
		
//		Collections.sort(emp, new Comparatorbyid());
//		System.out.println(emp);
//		
		
		
//		ArrayList<Employee> empn2 = new ArrayList<Employee>();
//		Collections.sort(empn2, new Comparatorbyname());
//		System.out.println(empn
		
		Collections.sort(emp, new SortName());
		System.out.println(emp);
		
		ArrayList<Employee>emp1=new ArrayList<Employee>();
		Collections.sort(emp1, new Comparatorbyid());
		System.out.println(emp1);
	}
	

	
}
