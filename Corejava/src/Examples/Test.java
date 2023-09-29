package Examples;

public class Test {
	public static void main(String[] args) {
		String [] s= {"RRRRohittt","patidaarr"};
	int	count=0;
		for(String str:s) {
		String st=	str.toLowerCase();
			for(char a='a';a<='z';a++) {
				for(int i=0;i<st.length();i++) {
					if(st.charAt(i)==a) {
						count++;
					}
				}
				if(count!=0) {
				System.out.println(a+"="+""+count);
				count=0;
			}
			}
			
		}
	}

}
