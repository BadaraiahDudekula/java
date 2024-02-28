public class Student {
	private String name;
	private int age;
	public void setName(String n) {
		this.name=n;
	}
	public void setAge(int a) {
		if(a>0&&a<100) {
			this.age=a;
		}
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
