
public class Test {

	public static void main(String[] args) {
		Bike b1=new Bike("Hero","black",80000);
		Bike b2=new Bike("RE","Orange",215000);
		Employee e1=new Employee("ramu","Infosys",30000);
		Employee e2=new Employee("Mahesh","Tcs",245000);
		
		Object x[]= {b1,b2,e1,e2};//Genraliation
		for(Object o:x) {
			System.out.println(o);
		}
	}

}
