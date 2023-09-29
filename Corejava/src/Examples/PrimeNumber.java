package Examples;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();  
//		int count = 0; 
//		
//		
//		for(int i = 1;i<=100;i++) {
//			count = 0;
//			for(int j= 1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//			
//			}if(count==2) {
//				System.out.println("these number are prime num"+ i);
//			}
//		}
		int count = 0;
//		int num = 0;
		for(int i=1;i<=100;i++) {
			count = 0;
			
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					
					count++;
				}
			
			
		}if(count==2) {
		
			System.out.println(i);
//		}else  {
//			System.out.println(num +" is not prime no.");
//		}
	}
	}
	}
}
	
	
	

