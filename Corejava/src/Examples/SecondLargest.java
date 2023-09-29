package Examples;

public class SecondLargest {
	public static void main(String[] args) {
		
		 
		int arr[] = {1,6,8,7,4,5};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);
	}

}
