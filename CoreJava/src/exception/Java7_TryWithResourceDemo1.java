package exception;

public class Java7_TryWithResourceDemo1 {

	public static void main(String[] args) {
		
		try(MyResource r = new MyResource()){
			System.out.println("MyResource created in try-with-resources");
			if (true)
				throw new Exception("Exception in try");
		} catch (Exception e) {
			System.out.println("catch");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
	}
}
class MyResource implements AutoCloseable{
	
	@Override
	public void close() throws Exception {
		System.out.println("My resource autoclose ");
		throw new Exception("from myresource");		
	}
	
}
