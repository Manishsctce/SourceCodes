package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList arrLists[][] = new ArrayList[10][10];
	
		ArrayList<Integer> arrList1 = new ArrayList();
		arrList1.add(101);
		arrList1.add(102);
		arrList1.add(103);
		arrList1.add(104);
		
		arrList1.listIterator();
		
		ArrayList<String> arrList2 = new ArrayList();
		arrList2.add("Manish");
		arrList2.add("Manish2");arrList2.add("Manish3");
	
		
		arrLists[0][0] = arrList1;
		
		
		//System.out.println(arrLists.);
	}

}
