package Single_leve_exercise_inheritance;

import Single_level.Circle;
import Single_level.Rectangle;
import Single_level.Shape;

public class TestShapeArry {
	public static void main(String[] args) {
		
	Shape [] s = new Shape[2];
	s[0] = new Rectangle();
	s[1] = new Circle();
	
	Rectangle r = (Rectangle) s[0];
	r.setLength(10);
	r.setWidth(20);
	r.Rarea();
	
	Circle c =  (Circle) s[1];
	c.setDaimeter(10);
	
	}
}

