
public class Test1 {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setName("Rahul");
		s.setAge(21);
		s.setPerc(80.5d);
		s.setName("Badri");//upadation
		System.out.println(s.getName()+" "+s.getAge()+" "+s.getPerc());
	}

}
