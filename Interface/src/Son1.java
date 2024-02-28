
public class Son1 implements Father1,Mother1{
	Son1(){
		super();
		System.out.println("Son1-constructor");
	}

	public static void main(String[] args) {
		Son1 s=new Son1();
		Father1.care();
		Mother1.care();
		
	}

}
