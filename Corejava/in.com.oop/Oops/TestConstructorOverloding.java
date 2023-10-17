package Oops;

public class TestConstructorOverloding{
	public static void main(String[] args) {
	ConstructorOverloading1 c = new ConstructorOverloading1();
	ConstructorOverloading1 c1 = new ConstructorOverloading1(787);
	ConstructorOverloading1 c2  = new ConstructorOverloading1(676," srpatel");
	
	System.out.println(c.id + " "+c.salary + " "+ c.name);
	System.out.println(c1.salary);
	System.out.println(c2.salary+ " " + c2.name );
	}

}
