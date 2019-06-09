package stringDemo;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {

	public static void main(String[] args) {
		System.out.println(permutation("123"));
		System.out.println(permutation("manish"));
	}
	
	public static Set<String> permutation(String str) {
		Set<String> strResult = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			strResult.add("");
			return strResult;
		}
		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = permutation(rem);
		for (String newString : words) {
			for (int i = 0; i <= newString.length(); i++) {
				strResult.add(strCharAdd(newString, firstChar, i));
			}
		}
		return strResult;
	}
	
	public static String strCharAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}
}
