package classesDemo;

public class InnerClassDemo {
	private String x = "outer var";
	void doStuff(){
		String z = "local var";
		class Inner{
			public void seeOuter(){
				System.out.println("outer x is :"+x);
				System.out.println("Local Var :"+z);
			}
		}
	}
}
