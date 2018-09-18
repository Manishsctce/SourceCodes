package stringDemo;

import java.util.Arrays;

public class StringOperationDemo1 {
	public static void main(String[] args) {
		
		System.out.println(isStringContainString("inheritance my god you are good", "od you"));;
		System.out.println(reverse("Manish hello how are you"));
		System.out.println(removeStringFromStrings("inheritance my god you are gods slave", "god"));
		
		System.out.println(replace("Hello Manish Agrawal Gaurav Agrawal", "Agrawal", "Jais"));
		
	}
	public static String replace(String string, String str1,String str2){
		boolean flag = true;
		char charArray1[] = convertStringIntoCharArray(string);
		char charArray2[] = str1.toCharArray();
		char charArray3[] = str2.toCharArray();
	
		
		char temp[] = new char[charArray1.length];
		int length1 = charArray1.length;
		int count=0;
		
		LABEL:		
			for(int i = 0;i<length1;i++){
			if(flag){
				if(charArray1[i]==charArray2[count]){				
					temp[i] = charArray3[count];
					count++;
					if(count==charArray3.length){
						flag = false;			
					}
				}
				else{
					temp[i] = charArray1[i];					
				}
			}
			else if(!flag){
				if(string.substring(i, length1-1).contains(str1)){
					count = 0;
					flag = true;
				}
				else{					
					temp[i] = charArray1[i];			
				}
			}			
		}		
		return String.valueOf(temp);
	}
	
	public static String reverse(String str){

		int newsize = 1;
		int length = str.length();
		char charArray[] = new char[1];
		for(int i=length-1, j=0;i!=-1;i--, j++){			
			charArray = Arrays.copyOf(charArray, newsize);
			newsize++;
			charArray[j]= str.charAt(i);
		}		
		return String.valueOf(charArray);
	}
	
	public static boolean isStringContainString(String string, String str){
		boolean flag = false;
		int count =0;
		char charArray1[] = convertStringIntoCharArray(string);
		char charArray2[] = convertStringIntoCharArray(str);
	
		int length1 = charArray1.length;
		int length2 = charArray2.length;
		
		for(int i=0;i<length1;i++){
			if(charArray1[i]==charArray2[count]){
				count++;
				if(count==length2-1)
					return true;
			}
			else{
				count=0;
			}
		}
		return flag;
	}
	
	public static String removeStringFromStrings(String string, String str){
		char charArray1[] = convertStringIntoCharArray(string);
		char charArray2[] = convertStringIntoCharArray(str);
		char temp[] = new char[charArray1.length];
		int count =0;
		
		int length1 = charArray1.length;
		int length2 = charArray2.length;
		if(isStringContainString(string, str)){
			for(int i=0,j=0;i<length1;i++){
				if(charArray1[i]!=charArray2[count]){
					temp[j] = charArray1[i];
					j++;
				}
				else{
					count++;
				}
			}
		}		
		return String.valueOf(temp);
	}
	public static char[] convertStringIntoCharArray(String str){
		int length = 1;
		char charArray[] = new char[1];
		for(int i=0;i<str.length();i++){
			length++;
			charArray = Arrays.copyOf(charArray, length);
			charArray[i]= str.charAt(i);
		}
		return charArray;
	}
	
	

}
