package java8features;

import static utilityClasses.DataCollections.getListofIntList;
import static utilityClasses.DisplayUtility.displayList_withPrint;
import static utilityClasses.DataCollections.getIntList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Map_FlatMap {

	public static void main(String[] args) { 
		System.out.println("##### Diff bet map and flatMap #########");
		
		System.out.println("\n\n============ map() =================");
		List<List<Integer>> l2 = getListofIntList().stream().map(li -> li)
		//.forEach(System.out::println);
		.collect(Collectors.toList());
		displayList_withPrint(l2);
		
		System.out.println("\n\n======= flatMap operation =======");
		List<List<Integer>> l1 = getListofIntList().stream().flatMap(li -> {					
					return Stream.of(li);
					})
				//.forEach(System.out::println);
				.collect(Collectors.toList());
		displayList_withPrint(l1);
		
		System.out.println("\n\n============2. map() =================");
		//getListofIntList().stream().map(li -> li.stream()).forEach(x-> System.out.print(x+" "));		
		Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4)).stream().map(i -> i.stream()).forEach(x-> System.out.print(x+" "));
		
		System.out.println("\n\n============2. flatMap() =================");
		getListofIntList().stream().flatMap(li -> li.stream()).forEach(x-> System.out.print(x+" "));
		//Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4)).stream().flatMap(i -> i.stream()).forEach(x-> System.out.print(x+" "));//1 2 3 4		
		
		System.out.println("\n\n============3. map() =================");
//		Arrays.asList(Arrays.asList(1,2,8),Arrays.asList(3,4,12)).stream().map(i -> i.stream().filter(j->j%2==0).collect(Collectors.toList()))
//		.forEach(x-> System.out.print(x+" "));//[2, 8] [4, 12]
		
		
		
		System.out.println("\n\n============3. flatMap() =================");
		Arrays.asList(Arrays.asList(1,2,8),Arrays.asList(3,4,12)).stream().flatMap(i -> i.stream().filter(j->j%2==0))
		.forEach(x-> System.out.print(x+" "));//2 8 4 12 
		
		//Stream.of(getListofIntList()).limit(1).forEach(System.out::println);;
		System.out.println("\n\n======= flatMap with filter stream operation =======");
		List<List<Integer>> l11 = 
				getListofIntList().stream().flatMap(li -> {					
			return Stream.of(li).map(y -> y.stream().filter(x -> x%2==0).collect(Collectors.toList()));
			})
		//	.flatMap(y -> y.stream())
		//.forEach(System.out::println);
		.collect(Collectors.toList());
		displayList_withPrint(l11);
		
		//System.out.println("\n\n=======  =======");
		//getIntList().stream().filter(x -> x%2==0).forEach(System.out::println);;
		
		System.out.println("\n\n======= 2 flatMap with filter stream operation =======");
		List<Integer> l12 = 
				getListofIntList().stream().flatMap(li -> {					
			return Stream.of(li).filter(x -> x.contains(222));
			})
			.flatMap(y -> y.stream())	
		.collect(Collectors.toList());
		displayList_withPrint(l11);
		
		
		
		

	}

}
