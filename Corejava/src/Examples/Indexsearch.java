package Examples;
import java.util.*;

public class Indexsearch {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the size");
		int size  = sc.nextInt();
		
		int numbers[] = new int[size];
		System.out.println("enter the numbers");
		for(int i = 0; i<numbers.length;i++) {
			
		 numbers[i] = sc.nextInt();
		 
		}
		System.out.println("search the index");
		int x = sc.nextInt();
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]==x) {
				System.out.println("index value of "+i);
				
			}
		}
	}
}	


