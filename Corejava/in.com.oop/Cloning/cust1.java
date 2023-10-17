package Cloning;

public class cust1 implements Cloneable {
	String name;
    cust a = new cust();
	public cust1(String name,int balance) {
		this.name = name;
		
		this.a.balance = balance;
		
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		cust1 c = (cust1) super.clone();
		c.a = (cust) a.clone();
		return c;
	}

}
