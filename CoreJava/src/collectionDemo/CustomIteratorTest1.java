package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomIteratorTest1 {
	public static void main(String[] args) {
		Students s1 = new Students(1001, "abc", 21);
		Students s2 = new Students(1002, "abcd", 22);
		Students s3 = new Students(1003, "abcde", 23);

		List<Students> studList = new ArrayList<Students>();
		
		studList.add(s1);studList.add(s2);studList.add(s3);
		
		for(Students s : studList){
			System.out.println(s);
		}
		
		Iterator itr = studList.iterator();
		while(itr.hasNext()){
			Students s = (Students)itr.next();
			System.out.println(s);
		}
	}

}
