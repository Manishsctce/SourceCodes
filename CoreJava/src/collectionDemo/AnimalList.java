package collectionDemo;
/* ANIMALLIST CLASS
 * it is a custom List class of Animal 
 * it has feature of List to iterate
 */
import java.util.ArrayList;
import java.util.Iterator;

public class AnimalList implements Iterable 
{

	private ArrayList animal = new ArrayList<String>();

	public AnimalList(ArrayList animal){
		this.animal = animal;
	}
	
	public boolean add(Object obj){
		return animal.add(obj);
	}
	
	public ArrayList getAnimal() {
		return animal;
	}

	@Override
	public Iterator iterator() {
		return new AnimalIterator(this);
	}

}