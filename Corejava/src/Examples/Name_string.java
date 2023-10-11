package Examples;

public class Name_string {
	public static void main(String[] args) {
		String name = "Harry";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.substring(3));
		System.out.println(name.substring(2, 4));
		System.out.println(name.replace("r", "p"));
		System.out.println(name.indexOf("Harry"));
		System.out.println(name.indexOf("s", 3));
		System.out.println(name.lastIndexOf("y"+"\t"));
		System.out.println(name.lastIndexOf("r", 4));
		
	}

}
