import java.util.*;

public class Map {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> h=new LinkedHashMap<>();
		h.put("Virat", 18);
		h.put("Dhoni", 7);
		h.put("Abd", 17);
		h.put("Maxwell", 33);
		for(Object o:h.entrySet()) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		for(Object o:h.keySet()) {
			System.out.print(o+" ");
		}
		System.out.println();
		for(Object o:h.values()) {
			System.out.print(o+" ");
		}
	}

}
