public class Sbi implements Upi {
	public void sendMoney() {
		System.out.println("sbi send money");
	}
	public void receiveMoney() {
		System.out.println("sbi recive money");
	}
	public void checkBalance() {
		System.out.println("sbi check balance");
	}
	public static void main(String[] args) {
		Upi s=new Sbi();
		Sbi s1=(Sbi)s;
		s.checkBalance();
		s.sendMoney();
		s.receiveMoney();
	}

}
