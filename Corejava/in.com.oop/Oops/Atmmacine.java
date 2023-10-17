package Oops;
import java.util.*;
public class Atmmacine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 1000;
		int pin = 1234;
		
		System.out.println("enter the user name");
		String username = sc.next();
		
		System.out.println("enter your pin");
		int u_pin = sc.nextInt();
		
		System.out.println("welcome to BOI");
		System.out.println("!!!Welcome......." + username);
		int choice = 0;  
		if(pin==u_pin) {
			
		do {
			System.out.println("1 withdrow");
			System.out.println("2 Deposit");
			System.out.println("3 Check balance");
			System.out.println("4 EXIT");	
			
			System.out.println("Enter your choice");
			 choice = sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("withdrow amount");
				int withdrow = sc.nextInt();
				if(withdrow>balance) {
					System.out.println("insufficent balance");
				}else {
					balance = balance-withdrow;
					System.out.println("succesfully withdrow amount");
					System.out.println("please check withdrow");
				}
				break;
			}
			case 2:{
				System.out.println("Enter the deposite amount");
				int dp = sc.nextInt();
				
				balance = balance+dp;
				
				System.out.println("succesfully deposit your amount");
				System.out.println("check amount");
		
			break;
				
			}
			case 3:{
				System.out.println("your balance..." +balance);
				break;
			}
			case 4:{
				System.exit(0);
			}
			
			
			}
			
			
		}while(choice!=4);
		
	}
		else {
			System.out.println("please check your pin");
		}

}
}
