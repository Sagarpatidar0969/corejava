package Examples;

public class Avg {
	public static void main(String[] args) {
		int a = 10;
		int sum = 0;
		int count = 0;
		
		
		for (int i = 1; i <=a; i++) {
			if(i % 2 == 0) {
				sum = sum+i;
				count++;
			}
			
		}
		 int  avg = sum/count;
		 
		 System.out.println(avg);
		
		
		
	}
}
