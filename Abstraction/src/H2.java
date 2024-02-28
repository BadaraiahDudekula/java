
public class H2 extends Bike{	
	H2(){
		super();
		System.out.println("concrete-class constructor");
	}
	@Override
	 void topSpeed() {
		System.out.println("300-kph");
		
	}
	void display1() {
		System.out.println("H2-method details");
	}
	public static void main(String[] args) {
		Bike h=new H2();//up casting
		H2 h1=(H2)h;//down casting
		h.brand="ninja";
		h.colour="white";
		h.price=2000000;
		h1.display1();
		h.display();
		h.topSpeed();
	}
}
