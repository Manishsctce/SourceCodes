package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static utilityClasses.DataCollections.getIntList;
import static utilityClasses.DataCollections.getListofIntList;
import static utilityClasses.DataCollections.getStringList;
import static utilityClasses.DisplayUtility.displayList_withPrint;
public class StreamDemo1 {
	public static void main(String args[]){
		
		//getStringList().stream().forEach(i-> System.out.print(i+", "));
		
		getIntList().stream().forEach(i-> System.out.print(i+", "));
		System.out.println();
	
		Arrays.asList(1,2,3,4,8,15).stream().map(i -> i*3).filter(j->j%2==0).forEach(System.out::println);//6 12 24
		
		System.out.println("\n##### IntStream #########");
		IntStream intStream = IntStream.range(1, 11);
		intStream.forEach(i->System.out.print(i+"|"));;		
		System.out.println();
		
		getIntList().stream().mapToInt(i->i).forEach(i->System.out.print(i+"|"));		
		System.out.println();
		
		System.out.println("##### Parallel Stream #########");
		getIntList().parallelStream().mapToInt(i->i).forEach(i->System.out.print(i+"|"));		
		System.out.println();
		
		System.out.println("##### Use Stream.of() #########");
		test_StreamOf();
		
		System.out.println("##### Use Stream.iterate() #########");
		test_Stream_iterate();
	}
	
	public static void printOddNumber() {
		getIntList().stream()
		.filter(i -> i%2 != 0)
		.map(i->i).forEach(i->System.out.print(i+", "));
	}
	
	public static void test_StreamOf() {
		Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
		Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
		if(firstNameWithD.isPresent()){
			System.out.println("First Name starting with D="+firstNameWithD.get()); //David
		}
	}
	
	public static void test_Stream_iterate() {
		//getStringList()
        Stream.iterate(2, n -> n + 2) .limit(25).forEach(i->System.out.print(i+"|"));
        
	}
}
