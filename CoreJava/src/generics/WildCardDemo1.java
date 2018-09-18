package generics;

import java.util.ArrayList;

public class WildCardDemo1 {

	public static void main(String[] args) {
		ArrayList<? extends Number> l = new ArrayList<Integer>();
		
		l.add(new Integer(123));
	}

}
