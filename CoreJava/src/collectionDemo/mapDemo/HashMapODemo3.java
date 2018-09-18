package collectionDemo.mapDemo;

import java.util.TreeMap;

final class MyKey implements Comparable{
	int x;
	int y;
	public MyKey(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

public class HashMapODemo3 {

	public static void main(String[] args) {


		final HashMap<MyKey, String> myHashMap = new HashMap<MyKey, String>();
		myHashMap.put( new MyKey(10, 20), "10-20" );
		myHashMap.put( new MyKey(10, 20), "10-20" );
		myHashMap.put( new MyKey(1, 2), "1-2" );

		System.out.println(myHashMap.get( new MyKey(1, 2) ));
	}

}
