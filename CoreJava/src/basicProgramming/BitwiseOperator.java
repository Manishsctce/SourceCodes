package basicProgramming;
/* 
 * Arithmetic operator - *, /, %, +, - 
 * Bitwise operator - |(OR) , & (AND), ^(XOR) 
 * Logical operator - &&(Logical-AND), ||(Logical-OR), 
 * Relation operator - <, >, <=, >=, instanceof
 * Ternary operator - ? :
 * Shift operator - <<, >>, >>>
 * equality operator - ==, !=
 * assignment  operator  =, +=, -= *= /= %= &= ^= |= <<= >>= >>>= 
 */
 public class BitwiseOperator {

	public static void main(String[] args) {
		String binary[] = {"0000","0001","0010","0011","0100","0101","0110","0111",
				"1000","1001","1010","1011","1100","1101","1110","1111"};
		
		int a = 7;
		int b = 5;		
		//int c = a | b;//Bitwise operator act as 111 OR 101 = 111 
		int d = a & b;
		int e = a ^ b;
		int f = (~a & b)|(a & ~b);
		int g = ~a & 0x0f; //0x0f = hexadecimal of 15 i.e 1111
	//	int h = ~a;

		System.out.println("Bitwise Inclusive OR Operator: (7|5)i.e 111 | 101 : "+ (a|b));
		System.out.println("Bitwise Operator(7&5)i.e 111 & 101 : "+ (a&b));
		System.out.println("Bitwise Exclusive OR: 111 ^ 101 : "+ (a^b));
		System.out.println("Bitwise operation on boolean value:(true|false): "+(true&false));
		System.out.println("f  (~a & b)|(a & ~b) = "+binary[f]);
		
		System.out.println("g = "+binary[g]);
//		System.out.println("~a = "+binary[h]);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println("Hash: "+hash(45));
	}

	   static int hash(int h) {
	        // This function ensures that hashCodes that differ only by
	        // constant multiples at each bit position have a bounded
	        // number of collisions (approximately 8 at default load factor).
	        h ^= (h >>> 20) ^ (h >>> 12);
	        return h ^ (h >>> 7) ^ (h >>> 4);
	    }
}
 