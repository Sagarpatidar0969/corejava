package Abstract1;
 abstract class Olg{
	void led() {
		System.out.println("olg take a 32 led providing");
	}
	abstract void tauch();
	abstract void carsur();
	//abstract void bloototh();
}
  abstract class Samsang extends Olg{
	 void led() {
		 System.out.println("samsung 32 led providing..");
	 }

	@Override
	void tauch() {
		System.out.println("providing tauch screen");
		
	}

	@Override
	void carsur() {
		// TODO Auto-generated method stub
		
		System.out.println("carsur");
		
	}
	 
 }
  

 

public class Tv_Main {

	public static void main(String[] args) {
		Olg o=new Olg() {
			
			@Override
			void tauch() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void carsur() {
				// TODO Auto-generated method stub
				
			}
		};
		o.led();
		System.out.println("------");
	Samsang m=new Samsang() {
	};
		m.tauch();
		m.carsur();
			
			
		

	}

}
