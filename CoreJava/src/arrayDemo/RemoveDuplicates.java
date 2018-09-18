package arrayDemo;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//int[] dupArr = new int[] {8,73,54,1,34,86,55,2,5,24,7,8,9,33,6,3,4,5,33,7,4,11,66,45,34,76,8,45,54};
		int[] dupArr = new int[] {1,1,1,1};
		/*for(int i : justUniques(dupArr)){
			System.out.print(i+" ");
		}*/
		
		unique_array(dupArr);
	}

	public static int[] justUniques(int[] arr) { 
		if (arr == null || arr.length == 0) return arr;
		Arrays.sort(arr);
		int n = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) n++;
		}
		int[] res = new int[n];
		res[0] = arr[0];
		n = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) 
				res[n++] = arr[i];
		}
		return res;

	}

	static void unique_array(int[] my_array){
		
		System.out.println("Original Array : ");
		for (int i = 0; i < my_array.length; i++){
			System.out.print(my_array[i]+"  ");
		}

		//Assuming all elements in input array are unique
		int no_unique_elements = my_array.length;

		//Comparing each element with all other elements
		for (int i = 0; i < no_unique_elements; i++) 
		{
			for (int j = i+1; j < no_unique_elements; j++)
			{
				//If any two elements are found equal
				if(my_array[i] == my_array[j])
				{
					//Replace duplicate element with last unique element
					my_array[j] = my_array[no_unique_elements-1];
					no_unique_elements--;
					j--;
				}
			}
		}

		//Copying only unique elements of my_array into array1
		int[] array1 = Arrays.copyOf(my_array, no_unique_elements);

		//Printing arrayWithoutDuplicates
		System.out.println();
		System.out.println("Array with unique values : ");
		for (int i = 0; i < array1.length; i++){
			System.out.print(array1[i]+"  ");
		}
		System.out.println();
		System.out.println("---------------------------");
	}
}
