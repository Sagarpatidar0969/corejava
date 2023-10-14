package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_method {
	public static void main(String[] args) {
		//PriorityQueue print first in 
		//Comparater.reverseOrder print only one high value
		Queue<Integer> num = new PriorityQueue<Integer>(Comparator.reverseOrder());
		num.add(101);
		num.add(1112);
		num.add(111);
		num.add(104);
		num.add(107);
		num.add(109);
		num.add(105);
		num.add(102);
		System.out.println(num.element());
		
		System.out.println(num);
		
		num.offer(222);
		System.out.println(num);
		
		System.out.println(num.peek());//show 0 index value
				
		num.poll();
		System.out.println(num);//out the value
		
		System.out.println(num.peek());
		
		num.poll();
		System.out.println(num);
		
		
		num.remove();
		System.out.println(num);
		
		
		
		
		
		
		
		
		
	}

}
