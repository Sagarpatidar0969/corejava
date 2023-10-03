package Copiletime_Runtime;

public class Circle1 extends Shape1 {
	
	
	       
		public static final double PI = 3.14;
		int radius;
		
//		public void setPi(double PI) {
//			this.PI = PI;
//		}
//		public double getPI() {
//			return PI;
//		}
	  public void setRedius(int radius) {
		  this.radius = radius;
	  }

		
		public int getRadius() {
			return radius;
		}
		
		public void Cirarea () {
			double Carea = PI * getRadius()*getRadius();
			System.out.println("carea is = " + Carea);
		}
		
	}

}
