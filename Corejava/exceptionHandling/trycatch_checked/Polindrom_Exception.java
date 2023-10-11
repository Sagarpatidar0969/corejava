package trycatch_checked;
class PolindramNumberException extends RuntimeException{
public  PolindramNumberException() {
	super("i am constructor");

}
     void polindram(int num) {
    	 
    	 int sum  = 0;
    	 int rem = 0;
    	 int temp = num;
    	 
    	 while(num>0) {
    		 rem = num%10;
    		 sum = sum*10+rem;
    		 num = num/10;
    		 
    	 }
    	 if(sum == temp) {
    		 System.out.println("polindrom");
    	 }else {
    		 throw new PolindramNumberException();
    	 }
     }


}

       public class Polindrom_Exception{
    	   public static void main(String[] args) {
			
		
    	   int num = 121;
    	   
    	   PolindramNumberException p = new PolindramNumberException();
    	   try {
    		   p.polindram(num);
    	   
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not polindram");
		}
       }
       }






