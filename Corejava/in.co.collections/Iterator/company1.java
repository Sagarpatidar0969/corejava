package Iterator;

public class company1 {
	
   String cname;
   String clocation;
   employee2 e;
public company1(String cname, String clocation, employee2 e) {
	super();
	this.cname = cname;
	this.clocation = clocation;
	this.e = e;
}
@Override
public String toString() {
	return "company1 [cname=" + cname + ", clocation=" + clocation + "]";
}
  
   

}
