package Encapsulation;

import java.util.Scanner;

public class Book{
  private String name;
  private int price;
  private String authorname;
  
  
  public void setName(String name) {
	  this.name = name;
  }
  public String getName() {
	  return name ;
	  
  }
  public void setPrice(int price) {
	  this.price = price;
  }
  public int getPrice() {
	  return price;
  }
  public void setAuthorname(String authorname) {
	  this.authorname = authorname;
  }
  public String getAuthorename() {
	  return authorname;
  }
  
  
  
  
  
}
 