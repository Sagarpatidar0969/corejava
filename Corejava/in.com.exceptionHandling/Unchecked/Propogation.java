package Unchecked;

public class Propogation {
	public static void main(String[] args) {
		m1();
//		try {
//			m1();
//		} catch (Exception e) {
//			System.out.println(e);
// 		}
	}
		public static void m1() {
			m2();
//			String name = "sr";
//			System.out.println(name.charAt(6));
//			
			
		}
		public static void m2() {
			try {
				m3();
				
			} catch (Exception e) {
				System.out.println(e);
			}
	}
		public static void  m3() {
			 String name = "srpatel";
			 System.out.println(name.charAt(9));
		}
}
