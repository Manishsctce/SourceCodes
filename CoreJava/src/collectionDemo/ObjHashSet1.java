package collectionDemo;

import java.util.HashSet;
import java.util.Set;

class Parent {
	protected HashSet<Integer>mySet = new HashSet<Integer>();
	public Parent() {
		mySet.add( 10 );
	}

	public Set<Integer>getSet() {
		return mySet;
	}
}

	public class ObjHashSet1 extends Parent{
		
		public ObjHashSet1(Integer val){
			mySet.add(10);
		}
		public HashSet<Integer>getSet() {
			return mySet;
		}
		public static void main(String[] args) {
			Parent obj = new ObjHashSet1( 20 );
			System.out.println( obj.getSet() );


		}
		
		public double getFactor(byte x, double y) {
			return (long)x / y * 3;
			}


	}
