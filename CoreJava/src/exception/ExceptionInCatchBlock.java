package exception;

public class ExceptionInCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Return: "+ exceptionMethod());
		
		

	}
	
	static int exceptionMethod() {
		
		int ret =0;
		
		try {
			ret = 5;
			return ret;
		}catch (Exception e) {
			ret = 5/0;
			
			return ret;
		}finally {
			ret =7;
			return ret;
		}
		//return ret;
	}

}
