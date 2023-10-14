package Map;

public class Course1 {
	int cid;
	String cname;
	int price;
	public Course1(int cid, String cname, int price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course1 [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
	}
	

}
