//checkedException

import java.io.*;

public class Demo2 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Demo.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
