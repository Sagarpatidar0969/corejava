package Cloning;

public class Cut implements Cloneable {
	String name;
	Accu1 a=new Accu1();
	public Cut(String name,int balance) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.a.balance=balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cut c=(Cut) super.clone();
		c.a=(Accu1) a.clone();
		return c;
	}

}
