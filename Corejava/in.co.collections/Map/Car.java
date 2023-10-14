package Map;

public class Car {
	
	String cname;
	int cprice;
	String ctype;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public String toString() {
		return "Car [cname=" + cname + ", cprice=" + cprice + ", ctype=" + ctype + "]";
	}
	

}
