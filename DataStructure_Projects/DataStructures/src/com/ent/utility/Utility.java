package com.ent.utility;

public class Utility {

	public static void display(int a[]){		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void display(int iter, int a[]){
		System.out.print(iter+": ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void display(String iter, int a[]){
		System.out.print(iter+": ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] getNumbersArray() {
		int arr[] = {2365, 324, 345, 234, 643, 245, 23};
		return arr;
	}
}
