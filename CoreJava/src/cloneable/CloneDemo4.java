package cloneable;

import java.util.HashMap;
import java.util.Map;

class ClassA {

	private int fieldX;
	private int fieldY;
	private Map<String, String>keyValues;
	public ClassA( int fieldX, int fieldY, Map<String, String> keyValues ) {
		super();
		this.fieldX = fieldX;
		this.fieldY = fieldY;
		this.keyValues = keyValues;
	}

	@Override
	public String toString() {
		return "ClassA [fieldX=" + fieldX + ", fieldY=" + fieldY + ", keyValues=" + keyValues + "]";
	}

}

class ClassB implements Cloneable {

	private ClassA classA;
	public ClassB( ClassA classA ) {
		super();
		this.classA = classA;
	}

	@Override
	public String toString() {
		return "ClassB [classA=" + classA + "]";
	}

	@Override
	protected ClassB clone() throws CloneNotSupportedException {
		return (ClassB) super.clone();
	}
} 
public class CloneDemo4 {

	public static void main( String[] args ) throws Exception {
		Map<String, String> keyValues = new HashMap<String, String>();
		keyValues.put( "X", "20" );
		keyValues.put( "Y", "30" );

		ClassB classB = new ClassB( new ClassA( 20, 30, keyValues ) );
		ClassB cloneClassB = classB.clone();

		System.out.println( cloneClassB );
	}

}
