package zzJavaObjective;

class IFruit{
	protected static String name = "Apple";
}
class Fruit extends IFruit{
	
}
public class Question9 {

	public static void main(String[] args) {
		System.out.println(Fruit.name);//Apple

	}
}
