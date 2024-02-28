
public class LaptopShowRoom {

	public static void main(String[] args) {
		Hp h1=new Hp("pavilion","silver",76000);
		Hp h2=new Hp("intel","white",56000);
		Dell d1=new Dell("Inspiron","silver",54000);
		Dell d2=new Dell("Inspiron2","black",65000);
		Apple a1=new Apple("Macbook","silver",1534000);
		Apple a2=new Apple("Macbook2","White",1894000);
		
		Object x[]= {h1,h2,d1,d2,a1,a2};
//		for(int i=0;i<x.length;i++) {
//			System.out.println(x[i]);
//		}
		for(Object o:x) {
			System.out.println(o);
		}

	}

}
