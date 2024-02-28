import java.util.ArrayList;

public class List_Fd_Bd {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<>();
		al.add(18);
		al.add(17);
		al.add(7);
		al.add(1);
//		for(Integer i:al) {
//			System.out.print(i+" ");
//		}
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		for(int i=al.size()-1;i>=0;i--) {
			System.out.print(al.get(i)+" ");
		}
	}

}
