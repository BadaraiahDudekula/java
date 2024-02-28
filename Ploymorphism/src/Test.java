//compiletime polymorphism
public class Test {
	static void display() {
		System.out.println("display");
	}
	static void display(int x) {
		System.out.println("display "+x);
	}
	static void display(String x) {
		System.out.println("display "+x);
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.display();
		t.display(18);
		t.display("Virat");
	}

}
