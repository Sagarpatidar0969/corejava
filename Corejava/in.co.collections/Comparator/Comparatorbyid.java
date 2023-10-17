package Comparator;

import java.util.Comparator;

import in.co.Iterator.employee2;

public class Comparatorbyid implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpid() - o2.getEmpid();
	}
	

}
