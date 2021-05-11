package com.ent.sorting;

import com.ent.utility.Utility;

public class QuickSortDemo1 {
	public static int[] quickSort(int a[]){
		quick(a,0,a.length-1);
		return a;
	}
	
	protected static void quick(int a[],int low,int up){
		int left = low;
		int right = up;
		int piv = low;//at beginning pivot is a[0]
		boolean pivot_placed=false;
		if(low>=up)
			return;
		
		while(pivot_placed==false){
			/*Right to left i.e toward pivot*/
			while(a[piv]<=a[right] && piv!=right){
				right = right-1;
			}
			if(piv==right)
				pivot_placed = true;
			
			if(a[piv]>a[right]){
				int temp = a[piv];
				a[piv]=a[right];
				a[right] = temp;
				piv = right;
			}
			
			Utility.display("1 Pivotal: "+piv, a);
			
			while(a[piv]>=a[left]&&left!=piv) {
				left = left+1;
			}
			if(piv==left)
				pivot_placed = true;
			
			if(a[piv]<a[left]){
				int temp = a[piv];
				a[piv] = a[left];
				a[left] = temp;
				piv = left;
			}
			Utility.display("2. Pivotal: "+piv, a);
		}
		 
		quick(a,low,piv-1);
		quick(a,piv+1,up);
		
	}
	
	public static void main(String[] args) {
		int arr[] = Utility.getNumbersArray();
		System.out.print("\nUnsorted arry: ");
		Utility.display(arr);
		System.out.println();
		
		int a[] = QuickSortDemo1.quickSort(arr);
		System.out.print("\n\nSorted Array using Quick sort: ");
		Utility.display(a);
		//Integer ;
		
	}
	
}
