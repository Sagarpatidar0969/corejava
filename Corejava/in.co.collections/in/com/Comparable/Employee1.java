package in.com.Comparable;

import java.util.ArrayList;

public class Employee1  implements Comparable<Employee1> {
	
		 public Employee1(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
		int id;
		 String name;
		 String phone;
		@Override
		public int compareTo(Employee1 o) {
			
//			 return this.id - o.id;
			
			if(this.id<o.id) 
				return 1;
			else if (this.id>o.id)
				return -1;
			
			return 0;
			
		}
		@Override
		public String toString() {
			return "Employee1 [id=" + id + ", name=" + name + ", phone=" + phone + "]";
		}
		
		
		}
			
	


		

