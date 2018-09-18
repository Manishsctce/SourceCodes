package java8features;

//
@FunctionalInterface
interface FInterface{
	void show(String name);
}

interface NumericTest {
	boolean computeTest(int n); 
	//boolean computeTest2(int n); 
}

interface MyString {
	String myStringFunction(String str);
}

public class LamdaExpressionDemo1 {

	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n % 2) == 0;//NumericTest must be Functional Interface
		NumericTest isNegative = (n) -> (n < 0);
		
		
		// Block lambda to reverse string
		MyString reverseStr = (str) -> {
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			return result;
		};
		
		System.out.println(isEven.computeTest(5));// Output: false		
		System.out.println(isNegative.computeTest(-5));// Output: true
		System.out.println(reverseStr.myStringFunction("Lambda Demo")); 
		
	}

}
