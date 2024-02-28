
public class Son implements Father,Mother {
	Son(){
		super();
		System.out.println("son-constructor");
	}
	public void care() {
		System.out.println("Father-Mother Care");
	}
	public static void main(String[] args) {
		Son s=new Son();
		s.care();
		
	}

}
