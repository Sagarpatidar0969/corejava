package Polymorphism;

public class Student {

	public void read() {//compile time polymorphism  with Overloading
		//same class same method but different method
		
		System.out.println("student reading book");
	}
	public void read(String bookname) {
		System.out.println("student reading book"+ " " + bookname);
	}
	
	
	public void read(String writer, int price) {
		System.out.println(writer);
		System.out.println(price);
	}
	
}
