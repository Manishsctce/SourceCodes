package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class SpliteratorExample {

	public static void main(String[] args) {
		//spliteratorCharacteristics();
		//getExactSizeIfKnown();
		//forEachRemainingExample();
		//getComparatorExample();
		tryAdvanceWithMultiThreadExample();

	}

	public static void tryAdvanceWithMultiThreadExample() {
		// Set<String> countires = new TreeSet<>();
		  List<String> states = new ArrayList<>();
		  states.add("Alabama");
		  states.add("Hawaii");
		  states.add("Alaska");
		  states.add("Michigan");
		  states.add("Vermont");
		  states.add("Wisconsin");
		  states.add("Texas");

		  System.out.println("Main thread name: " + Thread.currentThread().getName());
		  System.out.println("States Set : " + states);
		  Spliterator<String> statesSpliterator = states.spliterator();
		  
		  
		  // Thread 1
		  Thread thread1 = new Thread(new Runnable() {

		   @Override
		   public void run() {

		    while (statesSpliterator.tryAdvance(state -> System.out
		      .println("Thread Name: " + Thread.currentThread().getName() + ", State Name : " + state))) {
		     try {
		      Thread.sleep(500);
		     } catch (InterruptedException e) {
		      e.printStackTrace();
		     }
		    }
		    System.out.println("Thread 1 done");

		   }
		  });

		  // Thread 2
		  Thread thread2 = new Thread(new Runnable() {

		   @Override
		   public void run() {

		    while (statesSpliterator.tryAdvance(state -> System.out
		      .println("Thread Name: " + Thread.currentThread().getName() + ", State Name : " + state))) {
		     try {
		      Thread.sleep(500);
		     } catch (InterruptedException e) {
		      e.printStackTrace();
		     }
		    }
		    System.out.println("Thread 2 done");
		   }});
		  
		  thread1.start();
		  thread2.start();
		  System.out.println("Main thread done");
	}
	public static void getComparatorExample() {
		
		Set<String> seasons = new TreeSet<>();
		seasons.add("Summer");
		seasons.add("Fall");
		seasons.add("Snow");

		Spliterator<String> seasonsSpliterator = seasons.spliterator();
		Comparator<String> treeSetComparator = (Comparator<String>) seasonsSpliterator.getComparator();
		System.out.println(seasons);
		System.out.println(treeSetComparator);
		
		
		Set<String> lines = new HashSet<>();
		 lines.add("Line 1");
		 
		 Spliterator<String> linesSpliterator = lines.spliterator();
		 Comparator<String> setComparator = (Comparator<String>) linesSpliterator.getComparator();
		 System.out.println(setComparator);
	}
	public static void forEachRemainingExample() {
		Set lines = new HashSet<>();

		  IntStream.range(0, 10).forEach(i -> lines.add("Line number " + i));

		  System.out.println("Original list size " + lines.size());

		// Main spliterator
		  Spliterator linesIterator = lines.spliterator();

		// Splitted spliterator
		  Spliterator splittedLinesIterator = linesIterator.trySplit();

		  System.out.println("Elements processed by main iterator");
		  linesIterator.forEachRemaining(value -> System.out.println(value));

		  System.out.println("Elements processed by splitted iterator 1");
		  splittedLinesIterator.forEachRemaining(value -> System.out.println(value));
	}
	
	public static void spliteratorCharacteristics() {
		// Spliterator characteristics check for List
		List lines = new ArrayList<>();
		lines.add("This is line 1");
		Spliterator listSpliterator = lines.spliterator();
		System.out.println("ArrayList has the following characteristics : ");
		checkCharacteristics(listSpliterator);// ORDERED, SIZED, SUBSIZED

		// Spliterator characteristics check for Set
		Set setLines = new HashSet();
		setLines.add("This is line 1");
		Spliterator setSpliterator = setLines.spliterator();
		System.out.println("\nHashSet has the following characteristics : ");
		checkCharacteristics(setSpliterator);

		// Spliterator characteristics check for SortedSet
		Set sortedSetLines = new TreeSet();
		sortedSetLines.add("This is line 1");
		Spliterator sortedSetSpliterator = sortedSetLines.spliterator();
		System.out.println("\nTreeSet has the following characteristics : ");
		checkCharacteristics(sortedSetSpliterator);
	}
	
	public static void getExactSizeIfKnown() {
		List lines = new ArrayList<>();

		IntStream.range(0, 100000).forEach(i -> lines.add("Line number " + i));

		System.out.println("Original list size " + lines.size());

		Spliterator linesIterator = lines.spliterator();
		long estimatedSize = linesIterator.getExactSizeIfKnown();
		System.out.println("lines spliterator count for getExactSizeIfKnown() : " + estimatedSize);

		Spliterator splittedLinesIterator = linesIterator.trySplit();
		long splittedLinesIteratorCount = splittedLinesIterator.getExactSizeIfKnown();
		System.out.println(
				"lines splittedLinesIteratorCount count for getExactSizeIfKnown() : " + splittedLinesIteratorCount);

	}

	private static void checkCharacteristics(Spliterator spliterator) {
		if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
			System.out.println("CONCURRENT");
		}

		if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
			System.out.println("DISTINCT");
		}

		if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
			System.out.println("IMMUTABLE");
		}

		if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
			System.out.println("NONNULL");
		}

		if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
			System.out.println("ORDERED");
		}

		if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
			System.out.println("SIZED");
		}

		if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
			System.out.println("SORTED");
		}

		if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
			System.out.println("SUBSIZED");
		}
	}

}
