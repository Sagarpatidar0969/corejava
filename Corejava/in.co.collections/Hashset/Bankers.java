package Hashset;

public class Bankers implements Comparable<Bankers> {
	int id ;
	String name;
	int mo_no;
	String locatoin;
	public Bankers(int id, String name, int mo_no, String locatoin) {
		super();
		this.id = id;
		this.name = name;
		this.mo_no = mo_no;
		this.locatoin = locatoin;
	}
	@Override
	public String toString() {
		return "Bankers [id=" + id + ", name=" + name + ", mo_no=" + mo_no + ", locatoin=" + locatoin + "]";
	}
	
	@Override
	public int compareTo(Bankers o) {
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		return 0;
	}
 
}
