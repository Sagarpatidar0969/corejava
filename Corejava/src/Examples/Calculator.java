package Examples;

import java.util.Scanner;

public class Calculator {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("enter the operator + - * /");
		char op = sc.next().charAt(0);
		double result;
     	System.out.println("enter the choice");
		
		
		switch(op) {
		case '+':
			result = num1+num2;
			System.out.println("value is"+result);
			break;
		case '-':
			result = num1-num2;
			System.out.println("value is"+result);
			break;
		case '*':
			result = num1*num2;
			System.out.println("value is"+result);
			break;
		case '/':
		result = num1/num2;
		System.out.println("value is"+result);
		break;
		default:
			System.out.println("enter a valid operrator");
			
			
		}
		
	}
}
