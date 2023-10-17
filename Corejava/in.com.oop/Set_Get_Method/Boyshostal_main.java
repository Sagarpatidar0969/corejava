package Set_Get_Method;
import java.util.*;
public class Boyshostal_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of stuudent");
		int numberofstudent = sc.nextInt();
		
		System.out.println("enter the total money");
		int totalmoney = sc.nextInt();
		
		Boyshostel b = new Boyshostel(20,40000 );
		System.out.println("no. of student = " +b.getNumberOfStudent());
		System.out.println("tatal money = " +b.getTotalMoney());
			
		
	}

}
