package exception;

class MyThrowableClass extends Throwable{
	public void display(){
		System.out.println("My Throwable exception");
	}
}
public class ThrowableDemo1 {
	public static void main(String[] args) {
		try{
			throw new MyThrowableClass();
		}
		catch(MyThrowableClass e){
			e.display();
		}
		throw new Error();
	}

}
