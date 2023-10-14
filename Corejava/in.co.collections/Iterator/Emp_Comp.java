package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Emp_Comp {
	
	ArrayList<company1> al = new ArrayList<company1>();
	
	void checkCity(ArrayList<company1> al) {
		
		Iterator<company1>it = al.iterator();
		
		while(it.hasNext()) {
			company1 c = it.next();
			if(c.clocation.equalsIgnoreCase("noida")) {
				System.out.println(c.cname+ " " + c.e.eid + " " + c.e.name+ " " + c.e.esalary+ " "+ c.e.edepartment);
			}
			
		}
	}
	
	void checkCompany(ArrayList<company1> al) {
		Iterator<company1>it = al.iterator();
		
		while(it.hasNext()) {
			company1 cm2 = it.next();
			if(cm2.cname.equalsIgnoreCase("hcl")) {
				
				System.out.println(cm2.e.eid + " " + cm2.e.name + " " + cm2.e.edepartment + "  " + cm2.e.esalary+ " " + cm2.clocation);
			}
		}
	}
	
	void chechkName(ArrayList<company1> al) {
		Iterator<company1>it = al.iterator();
		
		while(it.hasNext()) {
			company1 cm3 = it.next();
			if(cm3.e.name.equalsIgnoreCase("sham")) {
				System.out.println(cm3.cname + " " + cm3.clocation + " " + cm3.e.eid + " " + cm3.e.edepartment + " " + cm3.e.esalary);
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Emp_Comp emp = new Emp_Comp();
		employee2 e = new employee2(101, "sham", "it",12000);
		employee2 e1 = new employee2(102, "sham", "hr", 13000);
		employee2 e2 = new employee2(103, "ram", "it", 12000);
		employee2 e3 = new employee2(104, "alex", "testing", 15000);
		
		company1 c = new company1("hcl", "noida", e);
		company1 c1 = new company1("infosys", "noida", e1);
		company1 c2 = new company1("hcl", "indore", e2);
		company1 c3 = new company1("microsoft", "indore", e3);
		
		ArrayList<company1> al = new ArrayList<company1>();
		al.add(c);
		al.add(c1); 
		al.add(c2);
		al.add(c3);
		
		System.out.println("serching city wise");
		
		emp.checkCity(al);
		
		System.out.println("-----------------------");
		System.out.println("searching company wise");
		emp.checkCompany(al);
		
		System.out.println("-----------------------");
		System.out.println("searching name wise");
		emp.chechkName(al);
		
		
		//System.out.println(al);
		
		
	}

}
