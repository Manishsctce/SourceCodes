package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String args[]){
		//int intArr[] = new int[] {1,2,3,4,5,6,7};
		Integer intArr[] = new Integer[] {1,2,3,4,5,6,7};
		String sArray[] = new String[] { "A", "B", "C", "D" };
		
		List<String> strlist = new ArrayList<String>();
		strlist.addAll(Arrays.asList(sArray));
		
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.addAll(Arrays.asList(intArr));
		
		//strlist.stream().forEach(i-> System.out.print(i+", "));
		
		intlist.stream().forEach(i-> System.out.print(i+", "));
		System.out.println();
		intlist.stream().filter(i -> i%2 != 0).map(i->i).forEach(i->System.out.print(i+", "));
		
		System.out.println();
		System.out.println("##### IntStream #########");
		IntStream intStream = IntStream.range(1, 11);
		intStream.forEach(i->System.out.print(i+"|"));;
		
		System.out.println();
		intStream = intlist.stream().mapToInt(i->i);
		intStream.forEach(i->System.out.print(i+"|"));
		
		System.out.println();
		System.out.println("##### Parallel Stream #########");
		intStream = intlist.parallelStream().mapToInt(i->i);
		intStream.forEach(i->System.out.print(i+"|"));
		
		System.out.println();
		System.out.println("##### Use Stream.of() #########");
		Stream<Integer> newIntStream = Stream.of(intArr);
		newIntStream.forEach(System.out::print);
		
		
		Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
		Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
		if(firstNameWithD.isPresent()){
			System.out.println("First Name starting with D="+firstNameWithD.get()); //David
		}
	}	
}
