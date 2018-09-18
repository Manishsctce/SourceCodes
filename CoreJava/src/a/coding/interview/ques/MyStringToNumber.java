package a.coding.interview.ques;

public class MyStringToNumber {
	  public static int convert_String_To_Number(String numStr){
	         
	        char ch[] = numStr.toCharArray();
	        int sum = 0;
	        //get ascii value for zero
	        int zeroAscii = (int)'0';
	        for(char c:ch){
	            int tmpAscii = (int)c;
	            sum = (sum*10)+(tmpAscii-zeroAscii);
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		  System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
	        System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
	        System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
	        
	        
	        String str1 = "xyz";
	        String str2 = "indial";
	        String str3 = str1+str2;
	        System.out.println(str1==str2);
	        
	        int a = 10;
	        int b = 9;
	        int c = 7;
	        
	        a = a>> b ^ c<<2;
	        System.out.println(a);
	        
	        Character ab = new Character('A');
	        System.out.println(ab+"\t"+(int)ab);

	}

}
