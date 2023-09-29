package in.co.batch;

import java.io.InputStream;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num  = sc.nextInt();
		//371,171
		
		int rem,sum = 0;
		int temp = num;
		
		while(num>0) {
			rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
			
			
		}if(temp==sum) {
			System.out.println("this  is Armstrong number ");
			
			
		}else {
			System.out.println("its not Armstrong number");
		}
		
		
		
	}


}
