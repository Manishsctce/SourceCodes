package stringDemo;
/* USES OF ASCII in java
 * conversion of int->String, char->int, String->int
 */
public class StringProgramming1 {
	static char charArray[] = new char[26];
	static StringBuilder pattern = new StringBuilder();
	public static void main(String[] args) {
		int ascii = 65;//A
		
		for(int i=0;i<26;i++){
			charArray[i] = (char)ascii; //convert ascii into char
			ascii++;
		}
		
		variousPattern(112);
		System.out.println(pattern);
		
	}
	
	public static void numberofpatter(int n){
		String temp = String.valueOf(n);
		
		
	}
	
	public static void variousPattern(int n){
		String temp = String.valueOf(n);// convert int into string
		int intvar = Integer.parseInt("123");//convert String into int
		
		for(int i=0;i<temp.length();i++){
				pattern.append(String.valueOf(charArray[(Character.getNumericValue(temp.charAt(i)))-1]));
			}		
		}
	}

