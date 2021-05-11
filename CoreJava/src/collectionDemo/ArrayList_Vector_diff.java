package collectionDemo;

import java.util.ArrayList;

import utilityClasses.DisplayUtility;
import utilityClasses.GetUtility;

import static utilityClasses.GetUtility.*;
import static utilityClasses.DisplayUtility.*;

public class ArrayList_Vector_diff {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.addAll(GetUtility.getNameList());
		
		displayList_withPrint(nameList);
		
		nameList.add("Manish");
		displayList_withPrint(nameList);
		
		nameList.add("Manish2");
		displayList_withPrint(nameList);
		
		nameList.remove("Vipul");
		displayList_withPrint(nameList);
	
		nameList.add("Vipul");
		displayList_withPrint(nameList);
	
	}

	
	
}
