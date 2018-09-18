
class Parent{
	int par1;
	private static int par2;
	final int a =0;
	void method(){
		class LocalInner{
			{
				int locpar = par1;
				int b = a;
				//void method1(){}
			}
		}
	}
}

public class LocalInnerClass {
	public static void main(String[] args) {
Parent.par2 =0;
	}

}
