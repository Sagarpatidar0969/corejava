package Single_level;

import java.io.IOException;
import java.nio.CharBuffer;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		
		s.setColor("red");
		s.setBorderWidth(56);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
		
		Rectangle r = new Rectangle();
		r.setLength(8);
		
		r.setWidth(10);
		r.setColor("black");
		r.setBorderWidth(10);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());	
			
		
		Circle c = new Circle();
		c.setRadius(5);
		c.setDaimeter(10);
		c.setBorderWidth(180);
		c.setColor("blue");
		c.setLength(8);
		c.setWidth(100);
		
		
		System.out.println(c.getRadius());
        System.out.println(c.getDaimeter());
        System.out.println(c.getBorderWidth());
        System.out.println(c.getColor());
        System.out.println(c.getLength());
        System.out.println(c.getWidth());
	}   
        
}
	
