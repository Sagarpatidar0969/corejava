package Oops;

public class ConstructorOverloading1 {

	 int salary;
	int id;
	 String name;
	
	public ConstructorOverloading1() {
		salary =1000;   id = 7273; name = "srpatel";
		
	}
	public ConstructorOverloading1(int s) {
	
		salary = s;
	}
	public ConstructorOverloading1(int s,String n) {
		salary = s;
		name = n;
	}
}
