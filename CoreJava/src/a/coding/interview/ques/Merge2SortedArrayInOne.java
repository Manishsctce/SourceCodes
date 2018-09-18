package a.coding.interview.ques;

public class Merge2SortedArrayInOne {
	 
	 public static void main(String[] args) {
	  int[] mergedArr = mergeTwoSortedArray(new int[]{10,15,22,80}, new int[]{5,8,11,15,70,90});
	  for (int i : mergedArr) {
	   System.out.print(i + " ");
	  }
	 }
	 
	 public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
	  int[] mergedArray = new int[arr1.length + arr2.length];
	  int i = 0, j = 0, index = 0;
	 
	  while (i < arr1.length && j < arr2.length){
	   if (arr1[i] < arr2[j])       
	    mergedArray[index++] = arr1[i++];
	   else       
	    mergedArray[index++] = arr2[j++];               
	  }
	 
	  while (i < arr1.length)  
	   mergedArray[index++] = arr1[i++];
	 
	  while (j < arr2.length)    
	   mergedArray[index++] = arr2[j++];
	 
	  return mergedArray;
	 }
	}
