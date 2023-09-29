package in.co.batch;

public class Primenum {
  public static void main(String[] args) {
	int j;
	;
	for(int i = 1;i<100;i++) {
		int flage = 0;
		for(j=2;j<i;j++) {
		 if(i%j==0) {
			 flage=1;
		 }
		}
		 if(flage==0) {
			System.out.println(j);
		}
}
	}
  }

