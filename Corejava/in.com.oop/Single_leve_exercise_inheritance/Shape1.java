package Single_leve_exercise_inheritance;



public class Shape1 {
	public static void main(String[] args) {
	
		
		
		
	
	class shape2{
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void area() {
		System.out.println("this area of method");
	}
	
}

class Rectangle {
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area(){
		int Rarea = getLength()*getWidth();
		System.out.println("Rarea = "+Rarea);
	}
}
    class Circle{
    	double pi = 3.14;
    	int radius;

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
		public void area() {
			double Carea =   pi*getRadius()*getRadius();
			
		}
    }
	}

}



