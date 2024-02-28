import java.util.*;
public class ArrayList_Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(18);
		al.add(17);
		al.add(25);
		al.add(45);
		al.add(7);
		/*Collections.sort(al);//ascending order
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);//descending order*/
		
		
		TreeSet<Integer> t=new TreeSet<>(al);
		System.out.println(t);  //ascending order
		
		System.out.println(t.descendingSet());
	}

}
