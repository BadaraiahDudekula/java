
public abstract class Bike {
String brand,colour;
int price;
Bike(){
	System.out.println("abstract class-constructor");
}
void display() {
	System.out.println(this.brand+" "+this.colour+" "+this.price);
}
abstract void topSpeed();
}

