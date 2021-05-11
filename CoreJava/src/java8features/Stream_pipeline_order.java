package java8features;

import java.util.stream.Stream;

public class Stream_pipeline_order {

	public static void main(String[] args) {
		Stream.of("s2", "b2", "a1", "d3", "c2")
		.map(s -> {
		    System.out.print("\nmap: " + s);
		    return s.toUpperCase();
		})
		.anyMatch(s -> {
		    System.out.print(" , anyMatch: " + s);
		    return s.startsWith("A");
		});

		//1st way
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		// 2nd way 
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
	}

}
