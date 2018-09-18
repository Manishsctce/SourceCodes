package stringDemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo1 {

	public static void main(String[] args) {
		String str = "Hi Manish, Very Goog-Morning. Hope you are doing well";
		System.out.println();
		StringTokenizer st1 = new StringTokenizer(str,", ");
		while (st1.hasMoreElements()) {
			Object object = (Object) st1.nextElement();
			System.out.println(object);
		}
		
		System.out.println("-------------------------");
		StringTokenizer st2 = new StringTokenizer(str, ". ,-");
		while (st2.hasMoreElements()) {
			Object object = (Object) st2.nextElement();
			//System.out.println(object);
		}
		String strsplit[] = new String[10];
		strsplit = str.split(", ");
		
		for (String s : strsplit) {
			System.out.println(s);
		}
	}

}
