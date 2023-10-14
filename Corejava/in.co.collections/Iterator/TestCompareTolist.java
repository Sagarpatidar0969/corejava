package Iterator;

public class TestCompareTolist {
	public static void main(String[] args) {
		
		CampareToList c1 = new CampareToList(1,"sagar","rajsthan");
		CampareToList c2 = new CampareToList(1,"sagar","rajsthan");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
