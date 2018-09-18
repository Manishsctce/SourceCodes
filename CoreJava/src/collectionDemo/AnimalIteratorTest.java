package collectionDemo;

import java.util.ArrayList;

public class AnimalIteratorTest {

	public static void main(String[] args) {
		ArrayList<String> animalList = new ArrayList();
		animalList.add("Horse");
		animalList.add("Lion");
		animalList.add("Tiger");
		AnimalList animal = new AnimalList(animalList);
	
		for (Object animalObj : animal) {
			System.out.println(animalObj);
		}
	}

}
