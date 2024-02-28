
public class Daughter extends Father {
	void drinking() {
		System.out.println("Boost");
	}

	public static void main(String[] args) {
		Father f=new Son();
		f.drinking();  //Tea
		System.out.println(f.money);
	}

}
