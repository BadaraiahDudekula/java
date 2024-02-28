import java.util.ArrayList;

public class Student {
	String name,qualification;
	int yop,perc;
	Student(String n,String q,int y,int p){
		this.name=n;
		this.qualification=q;
		this.yop=y;
		this.perc=p;
	}
	public String toString() {
		return this.name+" "+this.qualification+" "+this.yop+" "+this.perc;
	}

	public static void main(String[] args) {
		Student s1=new Student("Ramu","Btech",2023,80);
		Student s2=new Student("Mukesh","mba",2022,70);
		Student s3=new Student("manu","BTECH",2021,60);
		Student s4=new Student("suchith","mca",2023,90);
		Student s5=new Student("lambu","Btech",2022,65);
		Student s6=new Student("chaithu","MBA",2020,80);
		
		ArrayList <Student> al=new ArrayList<>();
		al.add(s1); al.add(s2); 	
		al.add(s3); al.add(s4); 
		al.add(s5); al.add(s6);
		for(Student s:al) {
			System.out.println(s);
		}
		System.out.println("============================");
		for(Student s:al) {
			String x=s.qualification;
			if(x.equalsIgnoreCase("btech")) {
				System.out.println(s);
			}
		}
		System.out.println("===============================");
		for(Student s:al) {
			if(s.yop==2023) {
				System.out.println(s);
			}
		}
		System.out.println("===============================");
		for(Student s:al) {
			String x=s.qualification;
			if(x.equalsIgnoreCase("Btech")&&s.yop==2023) {
				System.out.println(s);
			}
		}
	}

}
