package zzlogic;

public class ArraySplit {

	public static void main(String[] args) {
		
		Integer arrayList[] = new Integer[81];
		int temp[] = new int[6];
		for(int i=0;i<81;i++){
			arrayList[i] = i;
		//System.out.println(arrayList[i]);	
		}
		//System.out.println(arrayList[50]);
		
		for(int i=0,j=0,k=0;i<81;i++,k++){
			temp[j] = temp[j]+arrayList[i];
			if(k==26){
				System.out.println(temp[j]);
				k=0;
				j=j+1;
				temp[j] = 0;
			}
		}
		
	}

}
