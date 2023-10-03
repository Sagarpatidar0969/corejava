package Copiletime_Runtime;

public class TestSRC {
	public static void main(String[] args) {
		
	
	Shape1 s[] = new Shape1[2];
	s[0]	= 	new Rectangele1();
	s[1]     =  new Circle1();
	
	Rectangele1 r = (Rectangele1) s[0];
	
	r.setLength(10);
	r.setWidth(20);
	r.Rarea();
	
	
	
	
}

	
}
