package Encapsulation;

import java.util.Scanner;

public class Testjava {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the book name");
		String name = sc.next();
		
		System.out.println("enter the price");
		int price = sc.nextInt();
		 
		System.out.println("enter the authorenane");
		String name1 =sc.next();
		
		Book b = new Book();
		
		b.setName(name);
		b.setPrice(price);
		b.setAuthorname(name1);		
		System.out.println(b.getName());
		System.out.println(b.getPrice());  
		System.out.println(b.getAuthorename());
		
		
	}

}
