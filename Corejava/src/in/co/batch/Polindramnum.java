package in.co.batch;

import java.util.Scanner;

public class Polindramnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int num = sc.nextInt();
		
//		int temp =0;
//		temp = num;
		
		int rem =0, sum = 0;
		while(num>0) {
			rem = num % 10;
			sum = sum*10+rem;
			num = num/10;
		}
		//polindram no.
//		if(sum==temp) {
//			System.out.println("no is polindram");
//		}else {
//			System.out.println("no is not polindram ");
		
		//reverse no.
		System.out.println(sum);
		
	}
	

}
