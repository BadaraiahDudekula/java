
public class Test {

	public static void main(String[] args) {
		A a1=new B();//UpCasting
		B b1=(B)a1;//DownCasting
		C c1=(C)a1;//ClassCastException
	}

}
