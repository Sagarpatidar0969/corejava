package JavaQuestion;

public class Maximumnumber {
	
	public static void main(String[] args) {
		
	
		int [] arr = {55,44,22,34,56,78,53,89,45};
		
		int max = 0;
		
		for (int i =  0; i < arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
	     System.out.println(max);
	}
}
