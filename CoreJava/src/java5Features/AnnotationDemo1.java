package java5Features;
import static java.lang.System.*;//static import feature

class A{
	public void meth1(){
		out.println("In class A, meth1");
	}
	public void meth2(){
		
	}
}
class B extends A{
	@Override
	public void meth1(){
		out.print("in class b, meth1");
	}
}
public class AnnotationDemo1 {
	public static void main(String[] args) {

	}

}
