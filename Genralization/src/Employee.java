
public class Employee {
	String name,company;
	int sal;
	Employee(String n,String c,int s){
		this.name=n;
		this.company=c;
		this.sal=s;
	}
	public String toString() {
		return this.name+" "+this.company+" "+this.sal;
	}
}
