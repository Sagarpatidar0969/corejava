package Examples;
import java.util.*;

public class Indexsearch {
	public static void main(String[] args) {
//		Scanner sc =  new Scanner(System.in);
//		System.out.println("enter the size");
//		int size  = sc.nextInt();
//		
//		int numbers[] = new int[size];
//		System.out.println("enter the numbers");
//		for(int i = 0; i<numbers.length;i++) {
//			
//		 numbers[i] = sc.nextInt();
//		 
//		}
//		System.out.println("search the index");
//		int x = sc.nextInt();
//		
//		for(int i = 0;i<numbers.length;i++) {
//			if(numbers[i]==x) {
//				System.out.println("index value of "+i);
//				
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		System.out.println("entr the num ");
		int num [] = new int [size];
		
		for (int i = 0; i < num.length; i++) {
			int num[i] = sc.nextInt();
		}
		
		
		
		int [] arr = {1,4,6,8,9,3};
		
		int x = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == x) {
				System.out.println(i);
			}
			
			}
	}
}	


