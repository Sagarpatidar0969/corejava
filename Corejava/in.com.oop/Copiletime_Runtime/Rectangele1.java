package Copiletime_Runtime;

public class Rectangele1 extends Shape1{
		
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
			int Rarea =  getLength() * getWidth();
			
			System.out.println("Rectangle area=" + Rarea);
					
		}
		
		
		
		
		

	}


