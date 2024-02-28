
public class Bike {
	String brand,colour;
	int pric;
	Bike(String b,String c,int p){
		this.brand=b;
		this.colour=c;
		this.pric=p;
	}
	public String toString() {
		return this.brand+" "+this.colour+" "+this.pric;
	}
	
}
