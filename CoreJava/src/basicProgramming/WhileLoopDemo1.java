package basicProgramming;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		System.out.println("Now size: "+whileLoop(5));
		doWhileloop();
	}

	public static int whileLoop(int size){
		while(size != 0)
			size--;
		return size;
	}
	
	public static void doWhileloop(){
		 int I = 1;
	        do while ( I < 1 )
	        System.out.print("I is " + I);
	        while ( I > 1 ) ;
	}
}
