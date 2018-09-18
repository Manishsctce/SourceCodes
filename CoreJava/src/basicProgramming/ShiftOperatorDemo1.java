package basicProgramming;
/*
 * >> is shift Right operator
 * >> is shift Right zero fill operator 
 */
public class ShiftOperatorDemo1 {

	public static void main(String[] args) {
		int i = 345;
		System.out.println("1# "+ (i>>2));//101  => 001          0000000101  000000000
		System.out.println("2# "+ (i<<2));//101  => 10100(20)
		System.out.println("1# "+ (i>>>20));//
	}

}
