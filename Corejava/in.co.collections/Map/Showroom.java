package Map;

public class Showroom {
	
	String sname;
	String saddress;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Showroom [sname=" + sname + ", saddress=" + saddress + "]";
	}
	
	

}
