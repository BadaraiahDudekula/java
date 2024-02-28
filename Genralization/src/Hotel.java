//factory Method  
public class Hotel {

	Object order(int ip) {
		if(ip==1) {
			Idly i=new Idly();
			return i;
		}
		else {
			Dosa d=new Dosa();
			return d;
		}
	}
	public static void main(String[] args) {
		Hotel h=new Hotel();
		Object x=h.order(1);
		System.out.println(x);
	}
	
}
