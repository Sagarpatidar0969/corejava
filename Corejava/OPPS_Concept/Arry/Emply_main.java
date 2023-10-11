package Arry;

import java.util.Scanner;

public class Emply_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Empy_Exception [] e = new Empy_Exception[3];
		
		for (int i = 0; i < e.length; i++) {
			
			System.out.println("enter the emply name");
			String name = sc.next();
			
			System.out.println("enter the id");
			int id = sc.nextInt();
			
			System.out.println("enter the department name !!!!");
			String d_name = sc.next();
			
			System.out.println("enter  the department id");
			int d_id = sc.nextInt();
			
			System.out.println("enter the salary");
			int d_salary = sc.nextInt();
			
		    Department d = new Department(d_name, d_id, d_salary);
			e[i] = new Empy_Exception(d_id, d_name, d);
		}
		    	
		    for (int i = 0; i < e.length; i++) {
				
		    	
				if(e[i].d.d_salary>100000) {
		    		
		    		System.out.println("you are a senior developer");
		    		
		    	}
		    	
		    	else {
		    		
		    		System.out.println("you are a junior developer");
		    	}
			}	
			
		    
		    for (int i = 0; i < e.length; i++) {
		    	
		    	if(e[i].d.d_name.equalsIgnoreCase("HR")) {
		    		
		    	
		    	System.out.println("your department is HR");
				
			}else if(e[i].d.d_name.equalsIgnoreCase("testing")) {
				
				System.out.println("your department is testing");
				
			}else if(e[i].d.d_name.equalsIgnoreCase("it")) {
				
				System.out.println("your department is IT");
		    	
			}else {
				System.out.println("please enter the correct department");
			}
			
		 }	     

		
	}

}
