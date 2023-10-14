package Otherex;

import java.util.Scanner;
import java.util.*;

public class Calendar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		
		System.out.println("enter the month");
		int month = sc.nextInt();
	    while( month != 0) {
	    	
	    	if(month == 01 || month == 03 || month == 05 || month == 07 || month == 8 || month == 10 || month ==12) {
	    	for (int i = 1; i <= 31; i++) {
	    		System.out.println(i);
	    	}
				
			
	    	
	    
	    	}else if(month == 4 || month == 6 || month == 9 || month == 11) {
	    		
	    	for (int i = 1; i <=30; i++) {
				
			}
	    	}
	    	else{
	    		for (int j = 1; j <= 28; j++) {
	    			System.out.println(j);
	    		}
					
	    	}
	    }
	}
}   
