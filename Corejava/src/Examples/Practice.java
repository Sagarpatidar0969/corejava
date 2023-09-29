package Examples;

public class Practice {
public static void main(String[] args) {
	String name = "sagar PATEL patidar";
	
	System.out.println(name.length());
	System.out.println(name.charAt(4));
	System.out.println(name.indexOf("pa"));
	System.out.println(name.indexOf("a"));
	System.out.println(name.lastIndexOf("r"));
	System.out.println(name.replace("PATEL", "patidar"));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.startsWith("PATEL"));
	System.out.println(name.endsWith("dar"));
	System.out.println(name.substring(5));
}
}
