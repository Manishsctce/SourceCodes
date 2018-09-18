package staticKeyword;

import java.util.ArrayList;
import java.util.List;
//static variable is global variable. It is loaded once for the class loader.
public class StaticDemo1 {

	public static void main(String[] args) {
		ClassB obj1 = new ClassB();
		ClassB obj2 = new ClassB();
		ClassB obj3 = new ClassB();
		ClassB obj4 = new ClassB();
		List<String> list = new ArrayList<>();
		obj1.addMsg(list);
		obj2.addMsg(list);
		obj3.addMsg(list);
		obj4.addMsg(list);
		
		System.out.println(list);
	}

}

class ClassB{
	private static boolean alreadyAdded = false;
	
	public void addMsg(List<String> list){
		if(!alreadyAdded){
			list.add("Hi Manish");
			alreadyAdded = true;
		}
			
	}
	
}
