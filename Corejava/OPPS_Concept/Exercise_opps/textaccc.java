package Exercise_opps;

public class textaccc {
	public static void main(String[] args) throws CloneNotSupportedException {
		acccc a = new acccc(100);
		acccc a2 = (acccc) a.clone();
		a2.balance = 200;
		
		System.out.println(a.balance);
		System.out.println(a2.balance);
	}
}
