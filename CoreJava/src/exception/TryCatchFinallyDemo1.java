package exception;

public class TryCatchFinallyDemo1 {

	public static void main(String[] args) {
		try{
			System.out.println("try block");
			System.exit(0);
		}catch(Exception e){
			System.out.println("catch");
			System.exit(0);
		}finally {
			System.exit(0);
			System.out.println("finally");
		}
	}

}
