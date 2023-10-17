package Cloning;

public class Testmain {
	public static void main(String[] args) throws CloneNotSupportedException {
		cust1 c = new cust1("sagar", 99999);
		cust1 c2 = (cust1) c.clone();
		c2.name = "dilip";
		c2.a.balance = 7777;
		
		System.out.println(c.name);
		System.out.println(c.a.balance);
		
		System.out.println(c2.name);
		System.out.println(c2.a.balance);
	}

}
