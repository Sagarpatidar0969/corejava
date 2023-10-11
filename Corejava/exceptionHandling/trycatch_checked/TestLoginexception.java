package trycatch_checked;

public class TestLoginexception {
	public static void main(String[] args) {
		String name = "srpatel";
		
		if(name.equals("srpatel")) {
		System.out.println("yes valid user");
	}
	else {
		LoginException e = new LoginException();
				
	
			try {
				throw e ;
			} catch (Exception e2) {
				
				System.out.println(e2);
				
			}
}
}
}