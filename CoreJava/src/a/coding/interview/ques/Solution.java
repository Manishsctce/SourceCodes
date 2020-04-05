package a.coding.interview.ques;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result{
	
	
}
public class Solution {
	
	public static boolean magicalString(String str) {
		boolean magical = false;
		
		char[] charArr = str.toCharArray();
		
		Map<String, Integer> map = new HashMap<>();
		int oneCount = 0;
		int zeroCount = 0;
		for(char c : charArr) {
			if(c=='1')
				map.put("1", oneCount++);
			else if(c=='0')
				map.put("0", zeroCount++);
		}
		
		return map.get("1") == map.get("0")? true : false;	
	}
	
	public static List<String> getSubStrings(String str) {
		List<String> subStrings = new ArrayList<>();
		int count = str.length();
		int endIndex = 1;
		while(count!=0) {
			subStrings.add(str.substring(0, endIndex));
			endIndex++;
			count--;
		}
		return subStrings;
	}
	
	
    public static void main(String[] args) throws IOException {
    	
    	List<String> subStrings = getSubStrings("11001100");
    	List<String> magicalStrings = new ArrayList<>();
    	for(String str : subStrings) {
    		System.out.println(str);
    		if(magicalString(str))
    			magicalStrings.add(str);
    	}
    	System.out.println("##"+ magicalStrings);
    }
}
//class Result {
//	public static boolean replace = true;
//    /*
//     * Complete the 'maxMoves' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. STRING s
//     *  2. STRING t
//     */
//
//    public static int maxMoves(String s, String t) {
//        int count=0;
//        String remain = s;
//        while(replace && remain.length()>0){
//            remain = remainString(remain, t);
//            if(replace) 
//            	count++;
//        }
//        return count;
//    }
//
//    public static String remainString(String s, String t){
//    	replace = false;
//        String out = s.replaceFirst(t, "");
//        if(out.equals(t) && !s.equals(t)) { // ab = ab , abab != ab
//        	replace = true;
//        }else if(!out.equals(t) && s.equals(t)) { // ""=ab,  ab=ab
//        	replace = true;
//        }else if(!out.equals(s) && !out.equals(t)) { // ""=ab,  ""=ab
//        	replace = true;
//        }else if (!out.equals(t) && out.equals(s)) { // mish != an , mish=mish
//        	replace = false;
//        }
//        return out;
//    }
//    
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        //String s = bufferedReader.readLine();
//
//        //String t = bufferedReader.readLine();
//
//        int result = Result.maxMoves("aabcbdc", "abc");
//        System.out.println("##"+result);
////        bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
////
////        bufferedReader.close();
////        bufferedWriter.close();
//    }
//}
