package a.coding.interview.ques;

public class FindMissingNumFromArray {

	public static void main(String[] args) {

        int a[] = {3, 8, 7,13,15,9, 1,2,4,5,6,12,10,11 };
        System.out.println("Array Length: "+a.length);
        int miss = getMissingNo(a,a.length);
        System.out.println(miss);   

	}
	
	//Complexity O(n)
	static int getMissingNo (int a[], int n){
		int counter = 0;
		
        int total = (n+1)*(n+2)/2; 
        
        for (int i = 0; i< n; i++){
           total = total - a[i];
           counter++;
        }
        System.out.println("Complexity: "+counter);
        return total;
    }
      
}
