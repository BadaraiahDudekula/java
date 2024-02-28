import java.util.*;
public class Set_fd_bd {

	public static void main(String[] args) {
		LinkedHashSet <Integer> hs=new LinkedHashSet<>();
		hs.add(18);
		hs.add(45);
		hs.add(7);
		hs.add(17);
		hs.add(33);
		hs.add(56);
		for(Integer i:hs) {
			System.out.print(i+" ");
		}
//		System.out.println();
//		ArrayList <Integer> al=new ArrayList<>(hs);
//		
//		for(int i=0;i<al.size();i++) {
//			System.out.print(al.get(i)+" ");
//		}
//		System.out.println();
//		for(int i=al.size()-1;i>=0;i--) {
//			System.out.print(al.get(i)+" ");
//		}
		
		System.out.println();
		Object x[]=hs.toArray();//Convertion of toArray(
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]+" ");
		}
		
	}

}
