package collectionDemo;

import java.util.HashSet;
import java.util.Set;

class Parent2 {
    protected HashSet<Integer> mySet = new HashSet<Integer>();
    public Parent2() {
        mySet.add( 10 );
    }

    public Set<Integer> getSet() {
        return mySet;
    }
}

public class OHashSet1 extends Parent2 {
    public OHashSet1( Integer val ) {
        mySet.add( 10 );
    }

    public HashSet<Integer> getSet() {
        return mySet;
    }

         public static void main( String[] args ) throws Exception {
             Parent2 obj = new OHashSet1( 20 );
             System.out.println( obj.getSet() );
    }
         
         public double getFactor(byte x, double y) {
        	 return (long)x / y * 3;
        	 }
}



