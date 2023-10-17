package Single_leve_exercise_inheritance;

import Set_Get_Method.Shape;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	
	public void setLength(int length) {
		this.length = length;
		
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width = width; 
	}
	public int getWidth() {
		return width;
	}
	
	
	public void Rarea() {
		int Rarea1 =  getLength()*getWidth();
		
		System.out.println("Rectangle area=" + Rarea);
				
	}
	
	
	
	
	

}
