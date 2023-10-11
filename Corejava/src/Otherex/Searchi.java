package Otherex;

import java.util.Scanner;

public class Searchi{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,4,6,8,9,3};
		
		int x = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == x) {
				System.out.println(i);
			}
			
			}
		}
		
	}


