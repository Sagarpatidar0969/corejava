  package Exercise_opps;

public class TestPD {

	public static void main(String[] args) {
			Plus p = new Plus() {
				
				@Override
				public void multiply() {
					int a = 10;
					int b = 20;
					int mul = 0;
					
					mul = a * b;
					System.out.println(mul+"  " +"mul");
					
				}
			};
						p.Plus1();
						p.multiply();
	
	
		divide d = new divide() {
			
			@Override
			public void minus() {
					int a = 20;
					int b = 10;
					int min = 0;
					
					min = a - b;
					System.err.println(min+"  " +"minus");
			}
		};
			d.div();
			d.minus();
}
}
