package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import Arry.cours2;

public class Stu_Co_main {
	
	public static void main(String[] args) {
		Student1 s = new Student1(101, "sham","indore" );
		Student1 s1 = new Student1(102, "dev", "pune");
		Student1 s2 = new Student1(103, "ram", "price");
		
		Course1 c  = new Course1(100, "java", 1200);
		Course1 c1 = new Course1(200, "c++", 1300);
		
		
		HashMap<Student1,Course1>hm = new HashMap<>();
		hm.put(s, c);
		hm.put(s1, c1);
		hm.put(s2, c1);
		
		
		Set<Entry<Student1,Course1>>set = hm.entrySet();
		
		for(Entry<Student1,Course1>map:set) {
			Student1 st = map.getKey();
			Course1  co = map.getValue();
			
			if(co.cname.equals("c++")) {
				System.out.println(st.id + " " + st.name + " " + st.location + " " + co.cid + " " + co.cname + " " + co.price);
			}
			
		}
		
		
	}

}
l