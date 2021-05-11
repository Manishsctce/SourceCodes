package java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class FI_functionChaining {

	public static void main(String[] args) {
		Function<Integer, Integer> square = i -> i*i;
		Function<Integer, Integer> cube = i -> i*i*i;
		Function<Integer, Integer> divide = i -> i/2;
		
		Function<Integer, Integer> doubl = i -> i*2;
		
		Function<Integer,Integer> squareAndCube = square.andThen(divide).andThen(cube);
		Function<Integer,Integer> cubeAndDouble = doubl.compose(cube);
		
		Stream.of(1,2,3,4,5).map(squareAndCube).forEach(System.out::println);
		Stream.of(1,2,3,4,5).map(cubeAndDouble).forEach(System.out::println);
		
		Consumer<Integer> squareme = i -> System.out.println("Square me: "+ i*i +" ");
		Consumer<Integer> doubleme = i -> System.out.println("Double me: "+i*2 +" ");
		
		squareme.andThen(doubleme).accept(3);
	}

}
