package modifier;

import java.util.ArrayList;

public class FinalDemo2 {

	public static void main(String[] args) {
		final String[] CONSTANT_ARRAY = {"I", "can", "never", "change"};
		for(String str: CONSTANT_ARRAY)
			System.out.print(str+" ");
		
		CONSTANT_ARRAY[2] = "always"; //work perfectly.
		for(String str: CONSTANT_ARRAY)
			System.out.print(str+" ");
		
		
		final ArrayList<String> names = new ArrayList<String>();		
		ArrayList<String> anotherList = new ArrayList<String>();
		//names = anotherList;//compiler error 
		 names.add("Manish");//work perfectly.

	}

}
