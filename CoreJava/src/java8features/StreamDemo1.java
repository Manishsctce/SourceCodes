package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String args[]){
		
		//getStringList().stream().forEach(i-> System.out.print(i+", "));
		
		getIntList().stream().forEach(i-> System.out.print(i+", "));
		
		System.out.println();
	
		
		System.out.println("\n##### IntStream #########");
		IntStream intStream = IntStream.range(1, 11);
		intStream.forEach(i->System.out.print(i+"|"));;
		
		System.out.println();
		intStream = getIntList().stream().mapToInt(i->i);
		intStream.forEach(i->System.out.print(i+"|"));
		
		System.out.println();
		System.out.println("##### Parallel Stream #########");
		intStream = getIntList().parallelStream().mapToInt(i->i);
		intStream.forEach(i->System.out.print(i+"|"));
		
		System.out.println();
		System.out.println("##### Use Stream.of() #########");
		test_StreamOf();
		
		
	}
	
	public static void printOddNumber() {
		getIntList().stream()
		.filter(i -> i%2 != 0)
		.map(i->i).forEach(i->System.out.print(i+", "));
	}
	
	public static List<Integer> getIntList(){
		//int intArr[] = new int[] {1,2,3,4,5,6,7};
		Integer intArr[] = new Integer[] {1,2,3,4,5,6,7};
		return Arrays.asList(intArr);
	}
	
	public static List<String> getStringList(){
		String sArray[] = new String[] { "A", "B", "C", "D" };
		return Arrays.asList(sArray);
	}
	
	public static void test_StreamOf() {
		Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
		Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
		if(firstNameWithD.isPresent()){
			System.out.println("First Name starting with D="+firstNameWithD.get()); //David
		}
	}
}
