package polymorphism;

public class CartoonMovie {
	private void displayName (){
		System.out.println("Cartoon Movie");
	}

	public static void main(String[] args) {
		CartoonMovie movie = new LionKing ();
		movie.displayName();
	}
}
class LionKing extends CartoonMovie {
//no overriding is taking place due to private access specifier so method calling entirely depends on reference not Object
	 private void displayName(){
		System.out.println("Lion King is a Cartoon Movie");
	}
}

