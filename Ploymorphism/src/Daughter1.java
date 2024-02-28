
public class Daughter1 extends Father1 {
    static void learn() {
    	System.out.println("JavaScript");
    }
	public static void main(String[] args) {
		Father1 f=new Son1();
		f.learn();
	}

}
