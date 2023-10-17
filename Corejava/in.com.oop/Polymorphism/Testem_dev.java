package Polymorphism;

public class Testem_dev {
	public static void main(String[] args) {
		Employee e = new Developer();   //Runtime polymorphishm
		e.showdetails();				//Overriding
		
		Developer d = new Developer();
		d.showdetails();
		
	}

}
