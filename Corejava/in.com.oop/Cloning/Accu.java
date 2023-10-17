package Cloning;

public class Accu implements Cloneable {
	int balance;
	public Accu(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}
 @Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}
