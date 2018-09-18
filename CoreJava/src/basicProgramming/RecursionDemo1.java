package basicProgramming;

public class RecursionDemo1 {

	public static void main(String[] args) {
		
		display(5);
		
	}
	
	public static void display(int count){
		if(count == 0)
			return;
		System.out.println(count);
		display(--count);
		System.out.println(count);
			
	}
}
