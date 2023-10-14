package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_method {
	public static void main(String[] args) {
		//key are unique 
		Map<String, Integer> num = new HashMap<String, Integer>();
		
		num.put("one", 1);
		num.put("two", 2);
		num.put("three", 3);
		num.put("four", 4);
		num.put("five", 5);
		System.out.println(num);
//		num.clear();
//		System.out.println(num);
		
		
		System.out.println(num.containsKey("one"));
		System.out.println(num.containsValue(8));
		
		System.out.println(num.entrySet());
		
		System.out.println(num.get("one"));
	
		System.out.println(num.isEmpty());
		
		System.out.println(num.keySet());
		
		num.put("six", 6);
		System.out.println(num);
		
		num.remove("one");
		System.out.println(num);
		
		num.remove("two", 2);
		System.out.println(num);
		
		System.out.println(num.size());
		
		System.out.println(num.values());
		
	}

}
