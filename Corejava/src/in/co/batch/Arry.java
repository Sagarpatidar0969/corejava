package in.co.batch;

public class Arry {
	public static void main(String[] args) {
		
		int [][] num = new int [10][10];
		
		for(int i = 0;i<num.length;i++) {
			
			for(int j = 0;j<num.length;j++) {
				
				num[i][j] = (i+1)*(j+2);
				
				System.out.print(num[i][j] + "\t");
					
			}
			System.out.println();
			
		}
		
	}

}
