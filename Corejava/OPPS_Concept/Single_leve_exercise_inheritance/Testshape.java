package Single_leve_exercise_inheritance;

public class Testshape {
	public static void main(String[] args) {
		
		shape s = new shape();
		s.setColor("red");
		s.setBorderwidth(789);
		s.area();
		
		
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(5);
		r.Rarea();
		
		Circle c = new Circle();
		c.setRedius(10);
		c.Cirarea();
		
	}

}
