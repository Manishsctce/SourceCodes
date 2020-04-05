package zzJavaObjective;

public class ForLoopBased1 {
	public static void main(String[] args) {
		
		//Java differs from C++(or C) here. C++ considers all non-zero values as true and 0 as false. 
		/* 
		 * for (int i = 0; 1; i++) { System.out.println("Hello"); break; }
		 */

		for (int i = 0; true; i++) {
			System.out.println("Hello");
			all(10);
			break;
		}
	}
	
	public static void all(int t){
		String R[][] = new String[t+1][];
		R[0] =new String[0];
		for(int i = 1; i <= t; i++){
			R[i] = new String[(i/2) + 1];
			for( int j = 1; j <= i/2; j++){
				R[i][j] = (i-j) + "+" + j + "";
			}
		}
		System.out.println(" -> ["+t+"] =  ");
		for(int i = t; i >= 0 ; i-- ){
			for(int j = 1; j < R[i].length; j++){
				System.out.print(R[i][j]);
				for(int x= i; x < t; x++){
					 System.out.print("+1");
				}
				System.out.print(", ");
				
			}
			System.out.println();
		}
		System.out.println();
	}
}
