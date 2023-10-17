package Oops;

public class Testperson1 {
public static void main(String[] args) {
	Account A = new Account();
	
	A.setAccounttype("saving");
	A.setAccnum(63247389);
	A.setBalance(63986);
	
	System.out.println(A.getAccnum());
	System.out.println(A.getAccounttype());
	System.out.println(A.getBalance());
	
}
}
