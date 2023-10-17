package Finallychecked;

//import sun.tools.tree.FinallyStatement;

public class Finally1Checked {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
			
		}
	
	
	finally {
		System.out.println("worked");
	}
}
}