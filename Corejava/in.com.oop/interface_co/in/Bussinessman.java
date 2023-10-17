package interface_co.in;

public class Bussinessman implements Richman,SocialWorker {
	public static void main(String[] args) {
		Bussinessman b = new Bussinessman();
		b.helpToOther();
		b.earnMoney();
		b.donation();
		b.party();
	}
	@Override
	public void helpToOther() {
			System.out.println("help to other");
	}

	@Override
	public void earnMoney() {
			System.out.println("earn lot of money");
	}

	@Override
	public void donation() {
			System.out.println("donate money");
	}

	@Override
	public void party() {
			System.out.println("enjoy parties");
	}

}
