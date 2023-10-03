package Examples;

public class Palindromenumber {
	public static void main(String[] args) {
		int a = 171 ;
		int b = a;
		int c = 0; 
		int d;
		while(b>0) {
			
			d = b%10;
			c = c*10+d;
			b = b/10;
			
		}
		if(c==a) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome no.");
		}
	}

}
