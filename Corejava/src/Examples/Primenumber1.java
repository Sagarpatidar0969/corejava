package Examples;

public class Primenumber1 {
	public static void main(String[] args) {
		 
		int num = 11;
		int count = 0;
		
		for(int i = 2;i<num;i++) {
			if(num % i == 0) {
				count++;
			}	
			}if(count==0) {
				System.out.println("prime"+num);
			}else {
				System.out.println("not");
			}
		}
		
	}


