package com.ent.sorting;

import com.ent.utility.Utility;

/* BUBBLE SORT
 * It behave differently in best or worst case. Best Case = O(n) and worst case = O(n2)
 * 
 */
public class BubbleSortDemo1 {
	public static int[] bubbleSort(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length-i;j++){
				if(a[j-1]>a[j]){
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					Utility.display(j, a);
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int arr[] = Utility.getNumbersArray();
		System.out.print("\nUnsorted arry: ");
		Utility.display(arr);
		int a[] = bubbleSort(arr);
		System.out.print("\nAfter Bubble sort: ");
		Utility.display(a);
	}
	
}
