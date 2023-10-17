package Set_Get_Method;

public class employee {
	
	public static void main(String[] args) {
		Employee_Details ed = new Employee_Details();
		
		ed.setId(100);
		ed.setAge(34); 
		
		System.out.println(ed.getId());
		System.out.println(ed.getAge());
		
	}

}
