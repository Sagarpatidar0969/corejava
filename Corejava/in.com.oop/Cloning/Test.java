package Cloning;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cut c=new Cut("ram", 699);
		Cut c1=(Cut) c.clone();
		c1.name="dev";
		c1.a.balance=123;
		System.out.println(c.name);
		System.out.println(c.a.balance);
		
		
		System.out.println(c1.name);
		System.out.println(c1.a.balance);

	}

}
