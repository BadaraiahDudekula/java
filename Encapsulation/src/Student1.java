
public class Student1 {
	private String name;
	private int age;
	private double perc;
	public void setName(String x) {
		this.name=x;
	}
	public void setAge(int a) {
		if(a>0&&a<100) {
			this.age=a;
		}
		else {
			System.out.println("Invalid Age");
		}
	}
	public void setPerc(double p) {
		if(p>=0&&p<=100) {
			this.perc=p;
		}
		else
			System.out.println("Invalid percentage");
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getPerc() {
		return this.perc;
	}
}
