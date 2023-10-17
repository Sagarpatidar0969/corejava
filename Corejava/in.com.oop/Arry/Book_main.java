package Arry;

import java.util.Scanner;

public class Book_main {
	public static void main(String[] args) {
		int bookId;
		String bookName;
	   String authorName;
	   int price;  
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[10];
		
		
		int choice = 0;
		int count = 0;
		int flage = 0;
		while(true) {
			System.out.println("1.book name");
			System.out.println("2..update book");
			System.out.println("3..delete book");
			System.out.println("4.search book");
			System.out.println("5..get all");
			System.out.println("6..exit");
			System.out.println("7..insert book");
			System.out.println(" ");
			
			System.out.println("enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
			{      
				   System.out.println("add book");
				   System.out.println("enter the number of book add");
				   int size = sc.nextInt();
				   
				   for (int i = 0; i < size; i++) {
					   System.out.println("enter the book id ");
					   bookId = sc.nextInt();
					   System.out.println("enter the book name");
					   bookName = sc.next();
					   System.out.println("emter the book author name");
					   authorName = sc.next();
					   System.out.println("book price update");
					   price = sc.nextInt();
					   
					   b[i] = new Book(bookId, bookName, authorName, price);
					   count++;
		   
				}
					   
					   System.out.println("book add sucessfully");
					   break;			   
			}
			
			case 2 :{
				System.out.println("2..update book");
				System.out.println("enter the book id for update");
				bookId = sc.nextInt();
				for (int i = 0; i < b.length; i++) {
					if(b[i] != null&&b[i].getBookId()==bookId) {
						bookId = sc.nextInt();
						b[i].setBookId(bookId);
						
						System.out.println("ente the book author name update");
						authorName = sc.next();
						b[i].setAuthorName(authorName);		
						
						System.out.println("enter the book price update");
						price = sc.nextInt();
						b[i].setPrice(price);
											
					}
					
		
			}
				System.out.println("book update sucessfully");
				break;
				
			}
			case 3:
			{
				System.out.println("3..delete book");
				System.out.println("enter the book id for delete book");
				bookId = sc.nextInt();
				
				for (int i = 0; i < b.length; i++) {
					if(b[i] != null && b[i].getBookId()==bookId) {
						b[i] = null;
						
					}
					
					
				}
				
				System.out.println("book delete sucessfully");
				break;
			}
			
			case 4:
			{
				int i = 0;
				System.out.println("search book");
				System.out.println("enter the book id bt search book");
				bookId = sc.nextInt();
				
				System.out.println("bookId"+"\t"+"authorName"+"\t"+"price");
				
				for ( i = 0; i < b.length; i++) {
					if(b[i] != null && b[i].getBookId()==bookId) {
					flage = 1;
				}
			}
					if(flage==1) {
						System.out.println(b[i]);
					}
					else {
						System.out.println("book is not available");
						
					}
					System.out.println("seraching complete");
					break;
					
			}
			
			case 5 :
			{
				
				System.out.println("all info book");
				System.out.println("all the book are");
				bookId = sc.nextInt();
				System.out.println("bookId"+"\t"+"authorName"+"\t"+"price");
				for (int i = 0; i < b.length; i++) {
					if(b[i] != null && b[i].getBookId()==bookId) {
						System.out.println(b[i]);
					}
				}
				System.out.println("all book are this");
				break;
			}
			
			case 6: 
			{
				System.exit(0);
				
			}
			
			default  : {
				
				System.out.println("enter right choice");
			}
			
			break;
			
			case 7:
			     {
				     System.out.println("insert the book");
				     for (int i = 0; i < b.length; i++) {
						System.out.println("enter the book id");
						bookId = sc.nextInt();
						System.out.println("book name update");
						bookName = sc.next();
						System.out.println("author name update");
						authorName = sc.next();
						System.out.println("update the book price");
						price = sc.nextInt();
						
						 b[i] = new Book(bookId, bookName, authorName, price);
						 
					}
				     count++;
				     
				     
			   
			  }			
	     	}		
	    }
	}
}
