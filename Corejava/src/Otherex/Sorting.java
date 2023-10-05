package Otherex;

public class Sorting {
	
	public static void main(String[] args) {
		
	
		int [] arry = {1,3,5,7,8,9,2};
	 
		
		for (int i = 0; i < arry.length; i++) {
			
			for (int j = i+1; j < arry.length; j++) {
				
				if(arry[i]<arry[j]) {
					int temp1 = arry[i];
					arry[i]  = arry[j];
					arry[j]  = temp1;
					
				}
				
				
			}
			
		}
		
		printArry(arry);
		
	}	

public static  void printArry(int arry[]) {
	for (int i = 0; i < arry.length; i++) {
		System.out.println(arry[i]+" ");
	}
}
}
