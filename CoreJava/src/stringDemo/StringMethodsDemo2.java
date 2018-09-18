package stringDemo;

import java.io.UnsupportedEncodingException;

/*
 * Example source code to show the use of
 * static method valueOf(char[] data,int offset,int count)
 * String(char[] data, int offset,int count)
 * public int codePointAt(int index)
 * public byte[] getBytes(String charsetName) ----->????
 * public byte[] getBytes() - return array of ascii value
 * public boolean equals(Object anObject)
 */
public class StringMethodsDemo2 {
	public static void main(String[] args) {
		String name = "Manish Agrawal";
		String digit = "01234567890123456789";
		char[] charArray = new char[]{'t','e','s','t','s','t','r','i','n','g'};		
		// declaring the index of our char array to start
		int offset = 4;
		// number of characters we are getting on the character array
		// starting from offset argument
		int count = 6;
		
		// getting the String equivalent of char array data
		String strValue = String.valueOf(charArray,offset,count);
		// printing the String equivalent of char array
		System.out.println(strValue);
		String str1 = new String(charArray,4,6);
		System.out.println(str1);
		
		System.out.println("Data".codePointAt(0));//Give the ASCII value of char at index
		
		System.out.println("DATA".codePointBefore(1));//Give the ASCII value of char at index-1
		System.out.println("DATA".codePointCount(0, 4));
		byte byteArray[] = "i am manish".getBytes();
		/*byte byteArray1[] = "i am manish".getBytes("am");
		for(int i=0;i<byteArray1.length;i++)
			System.out.print(byteArray1[i]+ " ");*/
		
	}

}
