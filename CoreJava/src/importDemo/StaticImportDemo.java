package importDemo;

import static zzlogic.ClassWithStaticContent.PI;
import static zzlogic.ClassWithStaticContent.addIntergers;
import static zzlogic.ClassWithStaticContent.*;

public class StaticImportDemo {

	public static void main(String[] args) {
		//float PI = 3.142f;
		System.out.println(PI);
		System.out.println(addIntergers(1,2,3,4,5));
//		System.out.println(addFloats(1,2,3,4,5));
	
		InnerStaticClass obj = new InnerStaticClass();
		
	}

}
