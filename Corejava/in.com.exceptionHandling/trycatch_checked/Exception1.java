package trycatch_checked;

public class Exception1 {
	public static void main(String[] args) {
		
	

			int a = 10;
			int b = 0;
//			int c = a / b;
//			System.out.println(c);
			String name = "sagar";
//			System.out.println(name.charAt(10));
//			
			try {
			   	int c = a / b;
			System.out.println(c);
				
			} catch (Exception e) {
				System.out.println(e );

			}
			try {
//				String name = "sagar";
			System.out.println(name.charAt(10));
			
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}

}
