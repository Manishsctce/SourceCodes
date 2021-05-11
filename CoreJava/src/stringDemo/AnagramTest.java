package stringDemo;

import java.util.List;
import java.util.stream.Collectors;

public class AnagramTest {

	public static void main(String[] args) {
		
		System.out.println("isAnagram : "+isAnagram("Manish", "hsianM"));;
	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		List<Character> cl1 = getSortedCharList(s1);
		List<Character> cl2 = getSortedCharList(s2);
		
		return cl1.equals(cl2)? true:false; 
//		System.out.println(cl);
//		return true;
	}

	public static List<Character> getSortedCharList(String s){
		return s.toLowerCase().chars().mapToObj(c->(char)c).sorted().collect(Collectors.toList());
	}
}
