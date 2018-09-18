package zzlogic;

public class SelectionSorting {
	public static void main(String[] args) {
		//int arrayList[] = new int[10];
		int arrayList[] ={75, 35, 42, 39, 87, 24, 64, 57};
		//arrayList = {75, 35,42,13,87,24,64,57};
		int length = arrayList.length;//8
		int shortest =0;
		//shortest = arrayList[0];
		int temp=0;
		int count=0;
		boolean intial = true;
		System.out.println("\nBefore Sorting: ");display(arrayList);

		for(int i=0;i<length-1;i++){
			for(int j=i;j<length-1;j++){
				if(intial){
					shortest = arrayList[j];
					intial = false;
				}
				if(shortest>arrayList[j+1]){
					shortest=arrayList[j+1];
					count = j+1;
				}				
			}
			if(arrayList[i]>shortest){				
				temp = arrayList[i];
				arrayList[i] = shortest;
				arrayList[count] = temp;				
			}
			intial = true;
		}
		
		System.out.println("\nAfter Sorting: ");
		display(arrayList);
		//System.out.println("Smallest: "+ shortest+ " Position: " + (count+1));
		
	}
	static void display(int a[]){
		for(int i: a)
			System.out.print(i+" ");
	}
}
