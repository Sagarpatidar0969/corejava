package Arry;

import java.util.Scanner;

public class Coursestudentmain {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Student2 []s = new Student2[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println("enter the student id.....");
			int s_id = sc.nextInt();
			System.out.println("enter the student name");
			String s_name = sc.next();
			System.out.println("enter the course");
			String c_name = sc.next();
			System.out.println("enter the fees");
			int c_fees = sc.nextInt();
			
			cours2 c = new cours2(c_name, c_fees);
			s[i] = new Student2(s_id, s_name, false, c);
			
			
			
		}
		
		for (int i = 0; i < s.length; i++) {
			
			if(s[i].c.c_fees>1500) {
				s[i].isSpecial = true;
				System.out.println("you are special");
			}else {
				System.out.println("you are not specials");
			} 
		}
		
		for (int i = 0; i < s.length; i++) {
			if(s[i].c.c_name.equalsIgnoreCase("java")) {
				s[i].isSpecial = true;
				System.out.println("course is available ");
			}else if(s[i].c.c_name.equalsIgnoreCase("python")) {
				s[i].isSpecial = true;
				System.out.println("course is available ");
		}else {
			System.out.println("cousre not avilable");
		}
	}

	}
}