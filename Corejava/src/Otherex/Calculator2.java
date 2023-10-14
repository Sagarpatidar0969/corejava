package Otherex;

import java.util.Scanner;
import java.util.*;
//import com.sun.java.util.jar.pack.Instruction.Switch;

//import sun.swing.SwingAccessor;
 public class Calculator2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num1 = sc.nextInt();
		
		System.out.println("enter the second num");
		int num2 = sc.nextInt();
		
		System.out.println("enter the operation + - / *");
		char op = sc.next().charAt(0);
		
		double num;
		switch(op) {
		
		case '+':    num = num1 + num2;
					System.out.println(num);
		break;
		
		case '-':  num = num1 - num2;
		           System.out.println(num);
		break;
		
		case '*':   num = num1*num2;
					System.out.println(num);
		break;
		
		case '/':   num = num1/num2;
					System.out.println(num);
	   break;
	   
	   default: System.out.println("enter the correct operator");
		}
			
		
	}

}
