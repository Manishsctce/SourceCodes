package stringDemo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		
		System.out.println("Frequency of ILoveJava: "+frequencyMap("ILoveJava"));
	}
	
	
	public static Map<Character, Long> frequencyMap(String str) {		
		return str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
