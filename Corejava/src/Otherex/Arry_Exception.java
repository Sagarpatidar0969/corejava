package Otherex;

import java.util.Scanner;

public class Arry_Exception extends RuntimeException{
	public Arry_Exception() {
		super();
	}
	
	void search(int s) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==s) {
				flag = 1;
				
			}
		}
		if(flag==1) {
			System.out.println("number is present"+s);
		}
		else {
			throw new Arry_Exception();
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("search thr number");
		int s = sc.nextInt();
		Arry_Exception a = new Arry_Exception();
		try {
			a.search(s);
		} catch (Exception e) {
			System.out.println("this element not present");
	}
		
	}

}
