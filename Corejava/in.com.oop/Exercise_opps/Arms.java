package Exercise_opps;

import java.util.Scanner;

public class Arms {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;	
		}
		
		if(sum==temp) {
			System.out.println("arm");
		}else {
			System.out.println("not");
		}
}

}
