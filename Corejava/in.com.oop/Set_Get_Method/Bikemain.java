package Set_Get_Method;

import java.util.Scanner;

public class Bikemain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the bike color;" );
		String color  = sc.next();
		
		System.out.println("enter the prize");
		int prize = sc.nextInt();
		
		Bike bb = new Bike(color,prize);
		System.out.println("bike color is :" +bb.getColor());
		System.out.println("bike price is " +bb.getPrize());
	}

}
