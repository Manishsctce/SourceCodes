package com.ent.sorting;
/* INSERTION SORT
 * it check from 2nd elem till last in array and put it in correct place before pointer (i)
 * before pointer(i) all elements are in sorted order
 * 
 * Here no. of pass = no. of element
 * It time complexity is O(n) in best case and O(n2) in worst case i.e array are in reverse order
 */

import com.ent.utility.Utility;

public class InsertionSortDemo1 {
	public static int[] insertionSort(int a[]){
		int current =0;		
		for(int i=1;i<a.length;i++){
			current = a[i];
			// this check i-1 elem. and place it a correct position
			for(int j=i-1;j>=0 && current < a[j];j--){ 
				
				a[j+1]= a[j];
				a[j]= current;
				Utility.display(i+""+j, a);
			}		
		}		
		return a;
	}
	
	public static void main(String[] args) {		
		int arr[] = Utility.getNumbersArray();
		System.out.print("Unsorted arry: ");
		Utility.display(arr);
		int a[] = InsertionSortDemo1.insertionSort(arr);
		
		System.out.print("Sorted arry: ");
		Utility.display(a);
	}
		
}
