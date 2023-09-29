package in.co.batch;

import java.util.Scanner;

public class Noteclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int note[] = {500,200,100,50,20,10,5,2,1};
		int count = 0; 
		
		
		for (int i = 0; i < note.length; i++) {
			count = money/note[i];
			if(count>0) {
				System.out.println(note[i] + " " +count);
			}
			money = money%note[i];
			
		}
	}

}
