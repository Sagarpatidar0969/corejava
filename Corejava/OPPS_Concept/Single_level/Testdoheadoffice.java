package Single_level;

public class Testdoheadoffice {
	public static void main(String[] args) {
		
	
	
	Headoffice h = new Headoffice();
	h.setOfficename1("sr");
	 h.setOffficename2("sr1");
	 
	 System.out.println(h.getOfficename1());
	 System.out.println(h.getOffficename2());
	 
	 Branchesoffice b = new Branchesoffice();
	 
	 b.setBranch1("noida");
	 b.setBranch2("banglore");
	 b.setOfficename1("sr");
	 b.setOffficename2("patidar");
	 
	 
	 System.out.println(b.getBranch1());
	 System.out.println(b.getBranch2());
	 System.out.println(b.getOfficename1());
	 System.out.println(b.getOffficename2());
	}
}
