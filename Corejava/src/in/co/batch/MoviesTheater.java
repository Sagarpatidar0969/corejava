package in.co.batch;

import java.util.Scanner;

public class MoviesTheater {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("balconyprice =  100");
		System.out.println("seatprice =  50");
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter the money");
		int money = sc.nextInt();
		double pricebalcony = 100;
		double seatprice = 50;
		if(money==100) {
			
			System.out.println(pricebalcony = pricebalcony-pricebalcony*0.15);
			System.out.println("congratulation your ticket is booked");
			
		}else if(money==50) {
			System.out.println(seatprice = seatprice-seatprice*0.05);
			System.out.println("congratulation your ticket is booked");
		}else {
			System.out.println("please enter the valid amount");
		}
	}

		
}
