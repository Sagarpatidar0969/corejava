package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Sho_Car_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Showroom name.......");
		String sname = sc.next();
		System.out.println("enter the showroom location");
		String saddress = sc.next();
		
		
		
		System.out.println("enter the car name");
		String cname = sc.next();
		System.out.println("enter the price");
	    int cprice = sc.nextInt();
		System.out.println("enter the car type");
		String ctype = sc.next();
		
		Showroom s =  new Showroom();
		s.setSname(sname);
		s.setSaddress(saddress);
		
		Showroom s1 = new Showroom();
		s1.setSname(sname);
		s1.setSaddress(saddress);
		
		Showroom s2 = new Showroom();
		s2.setSname(sname);
		s2.setSaddress(saddress);
		
		Car c = new Car();
		c.setCname(cname);
		c.setCprice(cprice);
		c.setCtype(ctype);
		
		Car c1 = new Car();
		c1.setCname(cname);
		c1.setCprice(cprice);
		c1.setCtype(ctype);
		
		HashMap<Showroom, Car>hm = new HashMap<>();
		hm.put(s, c);
		hm.put(s1, c1);
		hm.put(s2, c1);
		
		
		Set<Entry<Showroom,Car>>set = hm.entrySet();
		for(Entry<Showroom,Car>map:set) {
			Showroom sho = map.getKey();
			Car ca = map.getValue();
			
			if(ca.cname.equals(cname)) {
				
				System.out.println(ca.cname+ " " + ca.cprice + " " + ca.ctype + " " + sho.sname+ " " + sho.saddress);
				
				
			}
		}
		
		
	}

}
