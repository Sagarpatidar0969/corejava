package Cloning;

public class Accu_main {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		Accu w=new Accu(120);
		Accu w1= (Accu) w.clone();
		w1.balance=134;
		System.out.println(w.balance);
		System.out.println(w1.balance);

	}

}
