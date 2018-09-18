package zzJavaObjective;
//Asked in Intelizign
import java.util.*;

public class CollectionsQuestion1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aAaA");
		list.add("aaAA");
		list.add("AaA");
		list.add("aaA");
		list.add("AAaa");
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
	}

}
