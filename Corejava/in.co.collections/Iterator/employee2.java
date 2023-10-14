package Iterator;

public class employee2 {
	
	int eid;
	String name;
	String edepartment;
	int esalary;
	public employee2(int eid, String name, String edepartment, int esalary) {
		super();
		this.eid = eid;
		this.name = name;
		this.edepartment = edepartment;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "employee2 [eid=" + eid + ", name=" + name + ", edepartment=" + edepartment + ", esalary=" + esalary
				+ "]";
	}
	
	
	

}
