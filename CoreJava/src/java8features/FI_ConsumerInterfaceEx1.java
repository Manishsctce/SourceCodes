package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FI_ConsumerInterfaceEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c","d");
		
		//1st way to use Consumer interface
		list.forEach(new ConsumerInterfaceImpl());
		System.out.println("");
		
		//2st way to use Consumer interface. Here we created consumer using lambda
		list.forEach(l -> System.out.print(l+" "));
		System.out.println();
		
		FI_ConsumerInterfaceEx1 c = new FI_ConsumerInterfaceEx1();
		//3st way to use Consumer interface. Here we created consumer using lambda
		list.forEach(l -> c.printEle(l));
		System.out.println();
		
		
		list.forEach(l -> c.printEle2(l));
		System.out.println();
		
		System.out.println("----end-----");
		
	}
	
	public void printEle(String s) {
		System.out.print(s+" ");
	}
	
	public String printEle2(String s) {
		System.out.print(s+",");
		return s;
	}
}

class ConsumerInterfaceImpl implements Consumer<String>{
	public void accept(String t) {
		System.out.print(t +" ");
	}
}
