import java.util.*;

public class SetSorting {

	public static void main(String[] args) {
		HashSet <Integer> hs=new HashSet<>();
		hs.add(18);
		hs.add(45);
		hs.add(17);
		hs.add(333);
		/*TreeSet<Integer> t=new TreeSet<>(hs);
		System.out.println(t);
		System.out.println(t.descendingSet());*/
		
		ArrayList al=new ArrayList<Integer>(hs);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}

}
