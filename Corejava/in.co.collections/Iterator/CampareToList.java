package Iterator;

public class CampareToList {
	int id;
	String name;
	String address;
	
	public CampareToList(int id,String name,String address) {
			
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + address;
	}
	
	@Override
	public boolean equals(Object obj) {
		
			if(!(obj instanceof CampareToList)) {
				return false;
			}
		
			CampareToList c =  (CampareToList) obj;
			boolean b = this.id ==c.id && this.name == c.name && this.address == c.address;
			return b;		
		
	}
	
			@Override
			public int hashCode() {
				String str = id + name + address;
				return str.hashCode();
			}
	
     }
